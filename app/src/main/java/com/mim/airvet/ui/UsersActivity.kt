package com.mim.airvet.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mim.airvet.R
import com.mim.airvet.adapter.UserAdapter
import com.mim.airvet.classes.Users
import com.mim.airvet.interfaces.API
import com.mim.airvet.interfaces.APIService

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Function
import io.reactivex.schedulers.Schedulers
import android.content.Intent
import android.os.Parcelable
import com.mim.airvet.classes.Result
import com.mim.airvet.interfaces.ClickListener
import java.util.ArrayList


class UsersActivity : AppCompatActivity() {
    private var apiService: APIService? = null
    private var usersRv: RecyclerView? = null
    private var adapter: UserAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inIt()
        callUser()
        usersRv?.addOnItemTouchListener(
            UsersActivity.RecyclerTouchListener(
                applicationContext,
                usersRv!!,
                object : ClickListener {

                    override fun onClick(view: View, position: Int) {


                    }

                    override fun onLongClick(view: View?, position: Int) {

                    }
                })
        )


    }

    private fun inIt() {
        usersRv = findViewById(R.id.rv_users)

    }

    private fun callUser() {

        apiService = API().getClient()!!.create(APIService::class.java)
        val observable: Observable<Users> = apiService!!.getUsers()

        observable.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread())
            .map(Function<Users, Any> { result: Users -> result })
            .subscribe(
                { item: Any -> handleResults(item as Users) }
            ) { t: Throwable ->
                handleError(
                    t
                )
            }
    }

    private fun onError(throwable: Throwable) {
        Toast.makeText(
            this, "OnError in Observable Timer",
            Toast.LENGTH_LONG
        ).show()
    }


    private fun handleResults(users: Users) {
        adapter = UserAdapter(this@UsersActivity, users.results)
        usersRv!!.layoutManager = LinearLayoutManager(this@UsersActivity)

        usersRv!!.adapter = adapter
        usersRv!!.addOnItemTouchListener(
            RecyclerTouchListener(
                this,
                usersRv!!,
                object : ClickListener {
                    override fun onClick(view: View, position: Int) {
                        val i = Intent(this@UsersActivity, UserDetailActivity::class.java)
                        i.putExtra(
                            "UserDetail",
                            users.results.get(position)
                        )
                        startActivity(i)
                    }

                    override fun onLongClick(view: View?, position: Int) {
                        // catPos = position
                    }
                })
        )
    }

    private fun handleError(t: Throwable) {
        Toast.makeText(
            this, "OnError in Observable Timer",
            Toast.LENGTH_LONG
        ).show()
        //Add your error here.
    }


    internal class RecyclerTouchListener(
        context: Context,
        recyclerView: RecyclerView,
        private val clickListener: ClickListener?
    ) : RecyclerView.OnItemTouchListener {

        private val gestureDetector: GestureDetector

        init {
            gestureDetector =
                GestureDetector(context, object : GestureDetector.SimpleOnGestureListener() {
                    override fun onSingleTapUp(e: MotionEvent): Boolean {
                        return true
                    }

                    override fun onLongPress(e: MotionEvent) {
                        val child = recyclerView.findChildViewUnder(e.x, e.y)
                        if (child != null && clickListener != null) {
                            clickListener.onLongClick(child, recyclerView.getChildPosition(child))
                        }
                    }
                })
        }

        override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {

            val child = rv.findChildViewUnder(e.x, e.y)
            if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
                clickListener.onClick(child, rv.getChildPosition(child))
            }
            return false
        }

        override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {}

        override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {

        }
    }
}