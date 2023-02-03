package com.example.whatsapp_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp_2.R.drawable.*
import com.example.whatsapp_2.databinding.FragmentStatusBinding


class StatusFragment : Fragment() {

    lateinit var binding: FragmentStatusBinding


    var name= arrayOf("mit","hit","yug","jay","vishal","jayesh","vijay","ankit","krish","man")
    var time= arrayOf("2:00AM","4:15AM","5:00pm","6:05AM","7:31PM","12:01AM","1:00AM","3:25AM","9:00PM","10:10PM")
    var profile= arrayOf(pic1, pic3, pic4, pic5, pic6, pic7, pic8, pic9, pic10, pic11)

    var arrayList=ArrayList<StatusData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentStatusBinding.inflate(layoutInflater)
        var binding=FragmentStatusBinding.inflate(layoutInflater)
        for (i in 0..profile.size-1){

            var data=StatusData(profile.get(i),name.get(i),time.get(i))
            arrayList.add(data)
        }

     binding.recyclerStatus.layoutManager=LinearLayoutManager(context)
        binding.recyclerStatus.adapter=StatusAdapter(arrayList)
        return binding.root

    }

}



