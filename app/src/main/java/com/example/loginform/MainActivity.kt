package com.example.loginform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.loginform.ui.component.OutlinedTextFieldWithTrailingIcon

import com.example.loginform.ui.theme.LoginformTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginformTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colorScheme.background)
                ) { innerPadding ->
                    DemoApp(
                        modifier = Modifier.padding(innerPadding),

                        )

                }

            }
        }
    }
}
@Composable
fun DemoApp(modifier: Modifier = Modifier){

    Column(
        modifier = modifier, //.padding(start = 8.dp, end = 8.dp)

    ) {
        Text(
            text = "Login",
            fontSize = 24.sp,
            style = MaterialTheme.typography.titleLarge,
            color = Color.Blue,
            modifier= Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            textAlign = TextAlign.Center,

            )



        OutlinedTextFieldWithTrailingIcon("User", Icons.Filled.Email, "Person Icon")
        OutlinedTextFieldWithTrailingIcon("Password", Icons.Filled.Lock)

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        ) {
            Text("Submit")
        }



    }
}
//}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginformTheme {
        DemoApp()
    }
}
