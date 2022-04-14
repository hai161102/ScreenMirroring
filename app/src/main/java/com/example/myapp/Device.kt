package com.example.myapp

class Device {
    var icon_Device : Int? = null
    var name_Device : String? = null

    fun setIconDevice(icon : Int){
        this.icon_Device = icon
    }

    fun setNameDevice(name : String){
        this.name_Device = name
    }

    fun getIconDevice() : Int? {
        return this.icon_Device
    }
    fun getNameDevice() : String? {
        return this.name_Device
    }
}