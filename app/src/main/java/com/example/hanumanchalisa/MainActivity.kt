package com.example.hanumanchalisa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hanumanchalisa.ui.theme.HanumanChalisaTheme
import com.example.hanumanchalisa.ui.theme.screen.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HanumanChalisaTheme {
                // A surface container using the 'background' color from the theme
              Scaffold( modifier = Modifier.fillMaxSize()) {innerPadding ->
                  HomeScreen(innerPadding)

              }
            }
        }
    }
}



