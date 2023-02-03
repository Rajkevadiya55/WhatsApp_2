package com.example.whatsapp_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class CallAdapter (arrayList: ArrayList<CallData>): RecyclerView.Adapter<CallAdapter.CallHolder>() {

    var recyclecall = arrayList
    lateinit var context: Context

    class CallHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var profile = itemView.findViewById<CircleImageView>(R.id.profile)
        var name = itemView.findViewById<TextView>(R.id.name)
        var time = itemView.findViewById<TextView>(R.id.time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallAdapter.CallHolder {
        context = parent.context
        return CallHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.call_recycle, parent, false)
        )

    }


    override fun getItemCount(): Int {
       return recyclecall.size
    }
    override fun onBindViewHolder(holder: CallAdapter.CallHolder, position: Int) {

        holder.name.text = recyclecall.get(position).name
        holder.time.text = recyclecall.get(position).time

        Glide.with(context).load(recyclecall.get(position).profile).into(holder.profile)
    }


}