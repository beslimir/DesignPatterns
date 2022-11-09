package com.beslimir.designpatterns

interface Currency {
    fun getSymbol(): String
    fun getCode(): String
}

enum class Country {
    UnitedStates, Germany, Croatia
}

class USDollar: Currency {

    override fun getSymbol(): String {
        return "$"
    }

    override fun getCode(): String {
        return "USD"
    }
}

class Euro: Currency {

    override fun getSymbol(): String {
        return "€"
    }

    override fun getCode(): String {
        return "EUR"
    }
}

class HRKuna: Currency {

    override fun getSymbol(): String {
        return "kn"
    }

    override fun getCode(): String {
        return "HRK"
    }
}

object CurrencyFactory {

    fun currency(country: Country): Currency {
        return when(country) {
            Country.Croatia -> {
                HRKuna()
            }
            Country.Germany -> {
                Euro()
            }
            Country.UnitedStates -> {
                USDollar()
            }
        }
    }

}