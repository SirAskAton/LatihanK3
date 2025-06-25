package com.example.latihank3

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihank3.ui.theme.LatihanK3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LatihanK3Theme {
            WelcomeScreen()
            }
        }
    }
}

@Composable
fun WelcomeScreen() {
    val context = LocalContext.current
    var nama by remember { mutableStateOf("") }

    Column (
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically)
    ){
        Text(
            text = "Welcome Traveler Rest Your Feet, Stay For A While",
            color = Color(0xFF0D2EDE),
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold
            )

        OutlinedTextField(
            value = nama,
            label = { Text("masukan nama")},
            onValueChange = {nama = it},
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = {
                Toast.makeText(context,"hallo $nama", Toast.LENGTH_SHORT).show()
            }
        ){
            Text( text = "Tampilkan Toast")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LatihanK3Theme {
        WelcomeScreen()
    }
}