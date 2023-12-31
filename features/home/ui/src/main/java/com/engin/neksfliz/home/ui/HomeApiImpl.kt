package com.engin.neksfliz.home.ui

import androidx.compose.ui.unit.Dp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.engin.neksfliz.common_ui.model.AppBarState
import com.engin.neksfliz.home.api.HomeApi

class HomeApiImpl: HomeApi {
    override val route: String
        get() = HomeApi.HomeRoot

    override fun registerGraph(
        navController: NavController,
        navGraphBuilder: NavGraphBuilder,
        initialPadding: Dp,
    ) {
        navGraphBuilder.navigation(startDestination = HomeApi.Home, route = HomeApi.HomeRoot){
            composable(HomeApi.Home){
                HomeScreen(initialPadding)
            }
        }
    }

    override fun registerGraph(
        navController: NavController,
        navGraphBuilder: NavGraphBuilder,
        onAppBarComposing: (AppBarState) -> Unit
    ) {
        navGraphBuilder.navigation(startDestination = HomeApi.Home, route = HomeApi.HomeRoot){
            composable(HomeApi.Home){
                HomeScreen()
            }
        }
    }

}