package com.mim.airvet.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.mim.airvet.R
import com.mim.airvet.classes.Result

class UserDetailActivity : AppCompatActivity() {
    private var picture: ImageView? = null
    private var cell: TextView? = null
    private var dob: TextView? = null
    private var email: TextView? = null
    private var gender: TextView? = null
    private var location: TextView? = null
    private var name: TextView? = null
    private var other: TextView? = null
    private var phone: TextView? = null
    private var registered: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)
        inIt()


    }

    private fun inIt() {
        val userDetails = intent.getParcelableExtra<Result?>("UserDetail")

        picture = findViewById(R.id.picture)
        name = findViewById(R.id.name)
        cell = findViewById(R.id.cell)
        gender = findViewById(R.id.gender)
        registered = findViewById(R.id.registered)
        dob = findViewById(R.id.dob)
        email = findViewById(R.id.email)
        location = findViewById(R.id.location)
        phone = findViewById(R.id.phone)


        setData(userDetails)


    }

    @SuppressLint("SetTextI18n")
    private fun setData(userDetails: Result?) {
        Glide.with(this@UserDetailActivity)
            .load(userDetails?.picture?.medium)
            .into(picture!!)
        cell?.text = userDetails?.cell.also { cell!!.text = it }
        dob?.text = userDetails?.dob?.date
        email!!.text = userDetails?.email
        gender!!.text = userDetails?.gender
        location!!.text = userDetails?.location?.city
        name!!.text = userDetails?.name?.first + " " + userDetails?.name?.last
        phone!!.text = userDetails?.phone
        registered!!.text = userDetails?.registered?.date
    }
}