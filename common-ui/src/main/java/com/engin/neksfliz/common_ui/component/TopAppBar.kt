@file:OptIn(ExperimentalMaterial3Api::class)

package com.engin.neksfliz.common_ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.engin.neksfliz.common_ui.R
import com.engin.neksfliz.common_ui.theme.NeksflizTheme

@Composable
fun NeksflizTopAppBar(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit,
    navigationIcon: @Composable () -> Unit = {},
    containerColor: Color,
    actions: (@Composable RowScope.() -> Unit)? = null
) {
    TopAppBar(
        modifier = modifier,
        title = title,
        actions = actions ?: {},
        navigationIcon = navigationIcon,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = containerColor,
        ),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun NeksflizTopAppBarPrev() {
    NeksflizTheme {
        Column {
            TopAppBar(
                title = {
                    Text(text = "Selam", style = MaterialTheme.typography.titleMedium)
                },
                navigationIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_neksfliz),
                        contentDescription = null
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent.copy(alpha = 0.7f),
                    scrolledContainerColor = Color.Black.copy(alpha = 0.7f)
                ),
            )
        }

    }
}