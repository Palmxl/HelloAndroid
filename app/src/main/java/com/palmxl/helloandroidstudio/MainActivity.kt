package com.palmxl.helloandroidstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.palmxl.helloandroidstudio.ui.theme.HelloAndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloAndroidStudioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        variablesYConstantes()
    }

    // Variables y contantes: Notacion var
    private fun variablesYConstantes(){

        // Variables
        var myFirstVariable = "Hello Palmxl!"
        println(myFirstVariable)

        var myFirstNumber = 1

        myFirstVariable = "Bienvenidos al tuto"
        println(myFirstVariable)

        var mySecondVariable = "Si!!!"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable
        println(mySecondVariable)

        // Constantes: Notacion val

        val myFirstConstant = "Constante!"
        println(myFirstConstant)

        val mySecondConstant = myFirstVariable
        println(mySecondConstant)

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloAndroidStudioTheme {
        Greeting("Android")
    }
}