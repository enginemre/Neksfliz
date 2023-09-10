package com.engin.neksfliz.home.api

import com.engin.neksfliz.navigation.FeatureApi

interface HomeApi : FeatureApi{
    companion object{
        const val Home= "/home"
        const val HomeRoot = "/"
    }
}