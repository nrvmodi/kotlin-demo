package com.nirav.modi

class Person internal constructor(firstName: String, lastName: String) {
    init {
        println("Create person $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String) :
            this(firstName, lastName) {
        println("Create person $firstName $middleName $lastName")
    }
}

fun main(args: Array<String>) {
    var me = Person("Nirav", "Modi", "bharatbhai");
}