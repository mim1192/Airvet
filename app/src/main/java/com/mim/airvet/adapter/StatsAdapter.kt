package com.mim.airvet.adapter

import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.mim.airvet.R
import com.mim.airvet.classes.Users
import com.mim.airvet.holder.UserViewHolder

class StatsAdapter(private val context: Context, list_: List<Users>?) :
    RecyclerView.Adapter<UserViewHolder>() {
    private val list: List<Users>?
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.list_item, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val thisRow: Users = list!![position]
      /*  holder.cases.setText("Total Cases : " + thisRow.getTotal_cases())
        holder.facilities.setText("Total Facilities : " + thisRow.getTotal_facilities())
        holder.hospitalizations.setText("Total Hospitalizations : " + thisRow.getTotal_hospitalizations())
        holder.vacinations.setText("Total Vaccinations :" + thisRow.getTotal_vaccinations())
        holder.recoveries.setText("Total Recoveries :" + thisRow.getTotal_recoveries())*/

    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    init {
        list = list_
    }
}
