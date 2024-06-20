package com.example.kiosk

class Food(private var name: String, private var desc:String, private var price: Int): Menu(name, desc) {
    override fun showMenu(){
        println("탁월한 선택, $name !!")
        println(desc)
        println("가격 : ${price}")
    }
}