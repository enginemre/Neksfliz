package com.engin.neksfliz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.engin.neksfliz.navigation.AppNavGraph
import com.engin.neksfliz.navigation.BottomBar
import com.engin.neksfliz.navigation.BottomTabs
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
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomBar(navController = navController, tabs = BottomTabs.tabs)},
        topBar = {
        }
    ) { paddings ->
         AppNavGraph(modifier = Modifier.padding(paddings),navController = navController, navigationProvider = navigationProvider)
    }
}
