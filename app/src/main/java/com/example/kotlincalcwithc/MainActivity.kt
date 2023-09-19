package com.example.kotlincalcwithc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlincalcwithc.ui.theme.KotlinCalcWithCTheme
import com.example.nativelib.NativeLib
import android.util.Log


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinCalcWithCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
        val addict = NativeLib().Add(40,50)
        val submiss = NativeLib().Subtract(40,50)
        val mult = NativeLib().Multiply(40,50)
        Log.e("test1","!!!!!!!!!!!_TEST_!!!!!!!!!!! add: ${addict}")
        Log.e("test2","!!!!!!!!!!!_TEST_!!!!!!!!!!! sub: ${submiss}")
        Log.e("test3","!!!!!!!!!!!_TEST_!!!!!!!!!!! mult: ${mult}")
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
    KotlinCalcWithCTheme {
        Greeting("Android")
    }
}