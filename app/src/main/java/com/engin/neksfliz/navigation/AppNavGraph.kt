package com.engin.neksfliz.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.engin.neksfliz.common_ui.model.AppBarState
import com.engin.neksfliz.home.api.HomeApi

@Composable
fun AppNavGraph(
    topPadding: Dp,
    bottomPadding: Dp,
    navController: NavHostController,
    navigationProvider: NavigationProvider,
    onAppBarComposing : (AppBarState) -> Unit
) {
    NavHost(
        modifier = Modifier.padding(bottom = bottomPadding),
        navController = navController, startDestination = HomeApi.HomeRoot
    ) {
        navigationProvider.homeApi.registerGraph(navController, this,topPadding)
        navigationProvider.newAndPopularApi.registerGraph(navController, this,onAppBarComposing)
        navigationProvider.downloadsApi.registerGraph(navController, this,onAppBarComposing)
    }
}