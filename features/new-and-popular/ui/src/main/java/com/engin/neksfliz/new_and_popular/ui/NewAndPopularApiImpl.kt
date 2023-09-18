package com.engin.neksfliz.new_and_popular.ui

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.engin.neksfliz.common.Routes
import com.engin.neksfliz.common_ui.model.AppBarState
import com.engin.neksfliz.new_and_popular.api.NewAndPopularApi

class NewAndPopularApiImpl : NewAndPopularApi {
    override val route: String
        get() = Routes.NewAndPopulars

    override fun registerGraph(
        navController: NavController,
        navGraphBuilder: NavGraphBuilder,
        onAppBarComposing: (AppBarState) -> Unit
    ) {
        navGraphBuilder.composable(route = Routes.NewAndPopulars){
            NewAndPopularScreen(onAppBarComposing,{})
        }
    }
}