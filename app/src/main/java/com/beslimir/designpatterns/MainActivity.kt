package com.beslimir.designpatterns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.beslimir.designpatterns.ui.theme.DesignPatternsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignPatternsTheme {
                /** Singleton example **/

                val person1 = Person
                person1.walk()

                val person2 = Person
                person2.walk()

                println("This is person1: $person1")
                println("This is person2: $person2")

                val animal1 = Animal("Dog")
                animal1.walk()

                val animal2 = Animal("Cat")
                animal2.walk()

                println("This is animal1: $animal1")
                println("This is animal2: $animal2")

                //Objects are singletons in kotlin and only one instance can be created,
                //which can be seen in the address of that object.
                //Normal classes can be instantiated many times. We can see that the two
                //animal instances have different addresses.

                /** Builder example **/
                val hamburger1 = Hamburger.Builder()
                    .addOnions(false)
                    .build()
                val hamburger2 = Hamburger.Builder()
                    .build()
                val hamburger3 = Hamburger.Builder()
                    .addBeef(true)
                    .addCheese(false)
                    .addOnions(false)
                    .build()

                println("Hamburger1: Beef: ${hamburger1.beef}, " +
                        "Onions: ${hamburger1.onions}, Cheese: ${hamburger1.cheese}")
                println("Hamburger2: Beef: ${hamburger2.beef}, " +
                        "Onions: ${hamburger2.onions}, Cheese: ${hamburger2.cheese}")
                println("Hamburger3: Beef: ${hamburger3.beef}, " +
                        "Onions: ${hamburger3.onions}, Cheese: ${hamburger3.cheese}")

                //This example shows how to construct a Builder class.
                //This way we handle building objects that contain a lot of parameters
                //and when we want to make the object immutable once done creating it.
            }
        }
    }
}