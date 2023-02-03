package com.example.whatsapp_2


var profile = 0
lateinit var name: String
lateinit var time: String


class CallData   {


    val profile: Any
    val time: CharSequence?
    val name: CharSequence?
    

    constructor(profile: Int, name: String, time: String) {
        
        this.profile = profile
        this.name = name
        this.time = time
    }
}