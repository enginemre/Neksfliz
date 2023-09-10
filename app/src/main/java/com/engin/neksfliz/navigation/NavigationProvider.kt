package com.engin.neksfliz.navigation

import com.engin.neksfliz.home.api.HomeApi
import javax.inject.Inject

 class NavigationProvider @Inject constructor(
    val homeApi: HomeApi
)