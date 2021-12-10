package com.mim.airvet.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mim.airvet.R
import com.mim.airvet.classes.Users
import com.mim.airvet.interfaces.API
import com.mim.airvet.interfaces.APIService
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Function
import io.reactivex.schedulers.Schedulers

class UsersActivity : AppCompatActivity() {
    var apiService: APIService? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        callUser()
    }

    private fun callUser() {

        apiService = API().getClient()!!.create(APIService::class.java)
        val observable: Observable<Users> = apiService!!.getUsers("5")
        observable.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread())
            .map(Function<Users, Any> { result: Users -> result })
            .subscribe(
                { joke: Any -> handleResults(joke as Users) }
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


    private fun handleResults(joke: Users) {
        joke.results.size

        //
    }

    private fun handleError(t: Throwable) {
        Toast.makeText(
            this, "OnError in Observable Timer",
            Toast.LENGTH_LONG
        ).show()
        //Add your error here.
    }


}