package com.nirav.modi

interface Vehicle {
    var manufacturer: String
    val steering: Int get() = 1 // You can not initialize variable directly

    //    val tyres : 4 // This will not work direct
    val tyres: Int get() = 4

    val color: String

    fun start() {
        println("Vroom Vroom")
    }

    fun getColor()

    fun getDoors(): Int

    fun stop() {
        println("stopping....")
    }
}


class Ford : Vehicle {
    override var manufacturer: String = "Ford"
    override val color: String = "Red"

    override fun getColor() {
        println("${manufacturer} car color is $color")
    }

    override fun getDoors(): Int = 4;

    override fun stop() {
        println("Stopping $manufacturer car")
    }
}


fun main(args: Array<String>) {

    var fordCar = Ford()
    fordCar.start()
    fordCar.getColor()
    fordCar.stop()
}