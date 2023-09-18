package com.engin.neksfliz.common_ui.model

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

data class AppBarState(
    val title: @Composable () -> Unit = {},
    val navigationIcon: @Composable () -> Unit = {},
    val containerColor : Color = Color.Black,
    val actions: (@Composable RowScope.() -> Unit)? = null
)
