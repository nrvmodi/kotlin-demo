package com.nirav.modi

object Temperatures {
    private var temperatures = arrayOf(50, 40, 60)

    fun getLastTemperature(): Int {
        return temperatures.last();
    }
}

fun main(args: Array<String>) {
    var location = object {
        var xPos = 100;
        var yPos = 200

        fun getPosition() {
            println("Location is ($xPos , $yPos)")
        }
    }

    location.getPosition()

    println("Last reading is ${Temperatures.getLastTemperature()} degrees")
}