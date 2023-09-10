package com.engin.neksfliz.downloads.ui

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.engin.neksfliz.common.Routes
import com.engin.neksfliz.downloads.api.DownloadsApi

class DownloadsApiImpl : DownloadsApi {
    override val route: String
        get() = Routes.Downloads

    override fun registerGraph(navController: NavController, navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.composable(route = Routes.Downloads){
            DownloadsScreen()
        }
    }
}