package com.engin.neksfliz.navigation

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.engin.neksfliz.home.api.HomeApi
import com.engin.neksfliz.ui.theme.NeksflizBlack10

@Composable
fun BottomBar(
    navController: NavController,
    tabs: List<BottomTabs>,
) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: HomeApi.HomeRoot

    NavigationBar(
        containerColor = NeksflizBlack10,
    ) {
        tabs.forEach { tab ->
            NavigationBarItem(
                label = {
                    Text(
                        text = stringResource(tab.title),
                        style = MaterialTheme.typography.labelMedium
                    )
                },
                selected = currentRoute == tab.route,
                onClick = {
                    if (tab.route != currentRoute) {
                        navController.navigate(tab.route) {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                        }
                    }
                },
                alwaysShowLabel = true,
                icon = {
                    Icon(
                        painterResource(if (currentRoute == tab.route) tab.selectedIcon else tab.icon),
                        contentDescription = stringResource(
                            id = tab.title
                        )
                    )
                },
                modifier = Modifier.navigationBarsPadding()
            )
        }
    }

}