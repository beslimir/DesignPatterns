package com.beslimir.designpatterns

class CarDI(private val engine: Engine) {

    fun start() {
        engine.start()
        println("The CarDI has started.")
    }


}