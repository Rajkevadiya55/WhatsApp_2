package com.example.whatsapp_2

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.google.android.gms.common.data.DataHolder
import de.hdodenhof.circleimageview.CircleImageView

class RecycleAdapter(arrayList: ArrayList<ChatsData>) :
    RecyclerView.Adapter<RecycleAdapter.DataHolder>() {

    var chatList = arrayList
    lateinit var context: Context

    class DataHolder(itemView: View) : ViewHolder(itemView) {

        var profile = itemView.findViewById<CircleImageView>(R.id.profile)
        var name = itemView.findViewById<TextView>(R.id.name)
        var msg = itemView.findViewById<TextView>(R.id.msg)
        var time = itemView.findViewById<TextView>(R.id.time)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {
        context = parent.context
        return DataHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycle, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {

        holder.name.text = chatList.get(position).name
        holder.msg.text = chatList.get(position).msg
        holder.time.text = chatList.get(position).time


        Glide.with(context).load(chatList.get(position).profile).into(holder.profile)
    }
}





