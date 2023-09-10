package com.engin.neksfliz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.engin.neksfliz.navigation.AppNavGraph
import com.engin.neksfliz.navigation.NavigationProvider
import com.engin.neksfliz.ui.theme.NeksflizTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationProvider: NavigationProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NeksflizTheme {
                val navController = rememberNavController()
                NeksflizApp(navController, navigationProvider)
            }
        }
    }

}

@Composable
fun NeksflizApp(navController: NavHostController, navigationProvider: NavigationProvider) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
         AppNavGraph(navController = navController, navigationProvider = navigationProvider)
    }
}
