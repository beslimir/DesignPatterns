package com.beslimir.designpatterns

object Person {

    init {
        println("This is a Singleton object. Just one instance in the whole app is created.")
    }

    fun walk() {
        println("The person is going for a walk.")
    }

}