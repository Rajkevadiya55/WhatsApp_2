package com.example.whatsapp_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp_2.R.drawable.*
import com.example.whatsapp_2.databinding.FragmentChatBinding


class ChatFragment : Fragment() {

    lateinit var binding: FragmentChatBinding


    var msg= arrayOf("hi","hello","how are yoy","good","haa","am","kya","km","no","have a nice day")
    var name= arrayOf("mit","hit","yug","jay","vishal","jayesh","vijay","ankit","krish","man")
    var time= arrayOf("1","2","3","4","5","6","7","8","9","10")
    var profile= arrayOf(pic1, pic3, pic4, pic5, pic6, pic7, pic8, pic9, pic10, pic11)

    var arrayList=ArrayList<ChatsData>()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

   binding= FragmentChatBinding.inflate(layoutInflater)

        var binding=FragmentChatBinding.inflate(layoutInflater)

        for (i in 0..profile.size-1){
            var data=ChatsData(profile.get(i),name.get(i),msg.get(i), time.get(i))
            arrayList.add(data)
        }

        binding.recycle.layoutManager=LinearLayoutManager(context)
        binding.recycle.adapter=RecycleAdapter(arrayList)

        return binding.root
    }

}