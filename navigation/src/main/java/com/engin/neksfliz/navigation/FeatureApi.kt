package com.engin.neksfliz.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.engin.neksfliz.common_ui.model.AppBarState

interface FeatureApi {

    val route : String

    fun registerGraph(
        navController: NavController,
        navGraphBuilder: NavGraphBuilder,
        onAppBarComposing : (AppBarState) -> Unit
    )
}