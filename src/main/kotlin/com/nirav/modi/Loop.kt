package com.nirav.modi

fun main(args: Array<String>) {


    for (item in 1..10) {
        println("Item no $item")
    }

    var ndx = 0
    for (item in 10.rangeTo(20).step(2)) {
        ndx ++
        println("Item $item at $ndx")
    }

    for ((index, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("Item $item at $index")
    }

    var myArray = arrayOf(10,20,30,40,50)

    for (index in myArray.indices) {
        println("Item ${myArray[index]} at $index")
    }
}