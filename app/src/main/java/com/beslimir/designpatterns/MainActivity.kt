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
            }
        }
    }
}