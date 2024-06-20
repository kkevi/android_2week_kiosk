package com.example.kiosk

open class Menu(
    private var name: String,
    private var desc: String) {

    open fun showMenu(){
        println("탁월한 선택, $name !!")
        println(desc)
    }
}