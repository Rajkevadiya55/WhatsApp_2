package com.example.whatsapp_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class StatusAdapter(arrayList: ArrayList<StatusData>) :
    RecyclerView.Adapter<StatusAdapter.StatusHolder>() {

    var recyclerStatus = arrayList
    lateinit var context: Context

    class StatusHolder(itemView: View) : ViewHolder(itemView) {

        var profile = itemView.findViewById<CircleImageView>(R.id.profile)
        var name = itemView.findViewById<TextView>(R.id.name)
        var time = itemView.findViewById<TextView>(R.id.time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        context = parent.context
        return StatusHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.status_recycle, parent, false)
        )

    }

    override fun getItemCount(): Int {
        return recyclerStatus.size
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {
        holder.name.text = recyclerStatus.get(position).name
        holder.time.text = recyclerStatus.get(position).time

        Glide.with(context).load(recyclerStatus.get(position).profile).into(holder.profile)
    }
}