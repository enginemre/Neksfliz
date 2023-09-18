package com.engin.neksfliz.downloads.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.engin.neksfliz.common_ui.model.AppBarState

@Composable
fun DownloadsScreen(
    onAppBarComposing: (AppBarState) -> Unit,
    navigateSearch: () -> Unit
) {
    LaunchedEffect(key1 = Unit) {
        onAppBarComposing(createToolbar(navigateSearch))
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Download Screen")
    }
}

private fun createToolbar(navigateSearch: () -> Unit): AppBarState {
    return AppBarState(
        title = {
            Text(text = "İndirilenler", style = MaterialTheme.typography.titleMedium)
        },
        actions = {
            IconButton(onClick = navigateSearch) {
                Icon(
                    modifier = Modifier.size(28.dp),
                    painter = painterResource(id = com.engin.neksfliz.common_ui.R.drawable.ic_search),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
    )
}