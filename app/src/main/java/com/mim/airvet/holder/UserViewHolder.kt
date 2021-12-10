package com.mim.airvet.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mim.airvet.R

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var email: TextView
    var cell: TextView
    var gender: TextView
    var userImage: ImageView


    init {
        email = itemView.findViewById(R.id.email)
        cell = itemView.findViewById(R.id.cell)
        gender = itemView.findViewById(R.id.gender)
        userImage = itemView.findViewById(R.id.user_image)

    }
}