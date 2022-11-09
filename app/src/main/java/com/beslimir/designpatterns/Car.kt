package com.beslimir.designpatterns

class Car {

    private val engine = Engine()

    fun start() {
        engine.start()
        println("The Car has started.")
    }

}