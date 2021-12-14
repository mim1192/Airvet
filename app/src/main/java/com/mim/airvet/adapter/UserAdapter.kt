package com.mim.airvet.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mim.airvet.R
import com.mim.airvet.classes.Result
import com.mim.airvet.holder.UserViewHolder

class UserAdapter(private val context: Context, list_: MutableList<Result>) :
    RecyclerView.Adapter<UserViewHolder>() {
    private val list: List<Result>?
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.list_item, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val thisRow: Result = list!![position]
        holder.email.setText(thisRow.email.toString())
        holder.cell.setText(thisRow.cell.toString())
        holder.gender.setText(thisRow.gender.toString())
        Glide.with(context)
            .load(thisRow.picture.medium)
            .into(holder.userImage)


    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    init {
        list = list_
    }
}
