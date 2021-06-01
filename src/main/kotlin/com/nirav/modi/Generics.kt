package com.nirav.modi

fun main(args: Array<String>) {

    var maxInt = max(10, 20);
    println("Max int: $maxInt")
    var maxLong = max(123456789099, 999999999999L);
    println("Max Long: $maxLong")
    var maxString = max("30", "20");
    println("Max String: $maxString")
}

fun <T : Comparable<T>> max(param1: T, param2: T): T {
    var res = param1.compareTo(param2)
    return if (res > 0) param1 else param2
}