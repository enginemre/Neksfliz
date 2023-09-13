package com.engin.neksfliz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.engin.neksfliz.common_ui.component.CollapsingToolbar
import com.engin.neksfliz.common_ui.theme.NeksflizTheme
import com.engin.neksfliz.navigation.AppNavGraph
import com.engin.neksfliz.navigation.BottomBar
import com.engin.neksfliz.navigation.BottomTabs
import com.engin.neksfliz.navigation.NavigationProvider
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NeksflizApp(navController: NavHostController, navigationProvider: NavigationProvider) {
    val scrollBehaviorPinned = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        bottomBar = { BottomBar(navController = navController, tabs = BottomTabs.tabs) },
        topBar = { CollapsingToolbar(scrollBehaviorPinned, scrollBehavior) }
    ) { paddings ->

        AppNavGraph(
            topPadding = paddings.calculateTopPadding(),
            bottomPadding = paddings.calculateBottomPadding(),
            navController = navController,
            navigationProvider = navigationProvider
        )

    }
}
