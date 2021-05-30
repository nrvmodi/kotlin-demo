package com.nirav.modi

fun main(args: Array<String>) {


    val burgerOrdered = 2

    when (burgerOrdered) {
        1 -> println("Not hungry")
        2 -> println("very hungry")
        in 3..6 -> println("Extreme hungry")
        else -> println("None")
    }

    when (burgerOrdered) {
        Math.abs(burgerOrdered) -> println("ordered")
        else -> println("None")
    }

    when {
        burgerOrdered != 0 -> println("Ordered")
        burgerOrdered % 2 != 0 -> println("Odd Ordered")
    }
}