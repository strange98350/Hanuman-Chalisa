package com.example.hanumanchalisa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.hanumanchalisa.ui.theme.HanumanChalisaTheme
import com.example.hanumanchalisa.ui.theme.screen.GayatriMantraScreen
import com.example.hanumanchalisa.ui.theme.screen.HomeScreen
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HanumanChalisaTheme {
                // Setting up the main UI with navigation
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 56.dp),
        bottomBar = {
            // Adding padding to move the BottomNavigation slightly above
            Box(modifier = Modifier.padding(bottom = 20.dp)) {
                BottomNavigationBar(navController)
            }
        }
    ) { innerPadding ->
        NavigationHost(navController = navController, modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val currentDestination = navController.currentBackStackEntryAsState().value?.destination?.route

    BottomNavigation {
        BottomNavigationItem(
            label = { Text("Hanuman Chalisa") },
            icon = { Icon(Icons.Default.Home, contentDescription = "Hanuman Chalisa") },
            selected = currentDestination == "home",
            onClick = {
                if (currentDestination != "home") {
                    navController.navigate("home")
                }
            }
        )
        BottomNavigationItem(
            label = { Text("Gayatri Mantra") },
            icon = { Icon(Icons.Default.Favorite, contentDescription = "Gayatri Mantra") },
            selected = currentDestination == "gayatri_mantra",
            onClick = {
                if (currentDestination != "gayatri_mantra") {
                    navController.navigate("gayatri_mantra")
                }
            }
        )
    }
}

@Composable
fun NavigationHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "home", modifier = modifier) {
        composable("home") { HomeScreen() }
        composable("gayatri_mantra") { GayatriMantraScreen() }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    HanumanChalisaTheme {
        MainScreen()
    }
}
