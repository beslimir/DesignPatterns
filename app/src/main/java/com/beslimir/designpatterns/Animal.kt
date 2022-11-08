package com.beslimir.designpatterns

class Animal constructor(
    private val name: String
){

    init {
        println("This is a class which can be instantiated many times, contrary to singletons.")
    }

    fun walk() {
        println("The $name is walking.")
    }
}