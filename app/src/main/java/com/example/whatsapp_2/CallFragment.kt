package com.example.whatsapp_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp_2.databinding.FragmentCallBinding
import com.example.whatsapp_2.databinding.FragmentStatusBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class CallFragment : Fragment() {
    lateinit var binding: FragmentCallBinding

    var name= arrayOf("mit","hit","yug","jay","vishal","jayesh","vijay","ankit","krish","man")
    var time= arrayOf("2:00AM","4:15AM","5:00pm","6:05AM","7:31PM","12:01AM","1:00AM","3:25AM","9:00PM","10:10PM")
    var profile= arrayOf(
        R.drawable.pic1,
        R.drawable.pic3,
        R.drawable.pic4,
        R.drawable.pic5,
        R.drawable.pic6,
        R.drawable.pic7,
        R.drawable.pic8,
        R.drawable.pic9,
        R.drawable.pic10,
        R.drawable.pic11
    )

    var arrayList=ArrayList<CallData>()


    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCallBinding.inflate(layoutInflater)
        var binding=FragmentCallBinding.inflate(layoutInflater)
        for (i in 0..profile.size-1) {


            var data = CallData(profile.get(i), name.get(i), time.get(i))
            arrayList.add(data)
        }

            binding.recyclecall.layoutManager= LinearLayoutManager(context)
            binding.recyclecall.adapter=CallAdapter(arrayList)
            return binding.root

    }

}