package com.nirav.modi

fun main(args: Array<String>) {

    var a = 10
    var b = 20
    println("Sum of $a + $b = ${sum(a, b)}")
    println()
    println("Sum of $a + $b = ${sum1(a, b)}")

    println()
    println("Sum of $a + $b = ${sum2(a, b)}")

    println()
    println("Sum of $a + $b = ${sum3()}")
}


fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun sum1(a: Int, b: Int): Int = a + b;

fun sum2(a: Int, b: Int) = a + b;

fun sum3(a: Int = 15, b: Int = 16) = a + b;
