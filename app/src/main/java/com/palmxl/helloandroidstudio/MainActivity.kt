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

        // variablesYConstantes() // Lección 1
        // tiposDeDatos() // Lección 2
        sentenciaIf() // Lección 3
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

    // Tipos de datos (Data Types)
    private fun tiposDeDatos(){

        /* String, Android Studio tiene inferencia de datos
        *  por lo que no hace falta poner el tipo "String"
        */
        val myString: String = "Hola!!"
        val myString2 = "Hola sin String!!!"

        // Concatenación
        val myString3 = myString + " " + myString2
        println(myString3)

        // Enteros (Byte, Short, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        // Operación
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimales (Float, Double)
        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        // val myBool3 = myBool2 + myBool2 No acepta opereciones
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    // Sentencia If
    private fun sentenciaIf(){

        val myNumber = 60

        // Operadores condicionales
        // > Mayor que
        // < Menor que
        // >= Mayor o igual que
        // <= Menor o igual que
        // == Igualdad
        // != Desigualdad

        if (myNumber <= 10){
            println("$myNumber es menor o igual que 10")
        } else {
            println("$myNumber es mayor que 10")
        }

        // Operadores lógicos
        // && operador "y"
        // || operador "o"
        // ! operador "no"

        if (myNumber <= 10 && myNumber > 5){
            println("$myNumber es menor o igual que 10 y mayor que 5")
        } else {
            println("$myNumber es mayor que 10 o menor o igual que 5")
        }

        if (!(myNumber <= 10 && myNumber > 5) || myNumber == 53){
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual que 53")
        } else if(myNumber == 60) {
            println("$myNumber es igual a 60")
        } else if (myNumber != 61)
            println("$myNumber no es igual a 61")
        else {
            println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual que 53")
        }
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