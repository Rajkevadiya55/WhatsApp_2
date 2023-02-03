package com.example.whatsapp_2

class   StatusData {


    var profile = 0
    lateinit var name: String
    lateinit var time: String


    constructor(profile: Int, name: String, time: String) {
        this.profile = profile
        this.name = name
        this.time = time
    }
}