package com.beslimir.designpatterns

class Hamburger private constructor(
    val cheese: Boolean,
    val beef: Boolean,
    val onions: Boolean
){

    class Builder {
        private var cheese: Boolean = true
        private var beef: Boolean = true
        private var onions: Boolean = true

        fun addCheese(value: Boolean) = apply { cheese = value }
        fun addBeef(value: Boolean) = apply { beef = value }
        fun addOnions(value: Boolean) = apply { onions = value }

        fun build() = Hamburger(cheese, beef, onions)
    }

}