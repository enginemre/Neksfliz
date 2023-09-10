package com.engin.neksfliz.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

interface FeatureApi {

    val route : String

    fun registerGraph(
        navController: NavController,
        navGraphBuilder: NavGraphBuilder
    )
}