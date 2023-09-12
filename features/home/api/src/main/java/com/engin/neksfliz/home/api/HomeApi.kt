package com.engin.neksfliz.home.api

import androidx.compose.ui.unit.Dp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.engin.neksfliz.navigation.FeatureApi

interface HomeApi : FeatureApi{

    fun registerGraph(
        navController: NavController,
        navGraphBuilder: NavGraphBuilder,
        initialPadding : Dp
    )
    companion object{
        const val Home= "/home"
        const val HomeRoot = "/"
    }
}