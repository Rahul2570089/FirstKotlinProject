package com.example.firstkotlinproject

import android.graphics.Color.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstkotlinproject.ui.theme.FirstKotlinProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstKotlinProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithImage(stringResource(R.string.birthday_message), stringResource(R.string.from_message))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface (color = Color.Transparent){
        Column {
            Text(
                text = "Hello $name!",
                fontSize = 35.sp,
                modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally).padding(start = 16.dp, end = 16.dp),
            )
            Text(
                text = "- from Rahul",
                fontSize = 24.sp,
                modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally).padding(start = 16.dp, end = 16.dp),
            )
        }
    }
}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop,

        )
        Greeting("World")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstKotlinProjectTheme {
        BirthdayGreetingWithImage(stringResource(R.string.birthday_message), stringResource(R.string.from_message))
    }
}