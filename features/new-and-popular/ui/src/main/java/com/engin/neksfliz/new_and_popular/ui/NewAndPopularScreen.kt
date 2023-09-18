package com.engin.neksfliz.new_and_popular.ui

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
import com.engin.neksfliz.common_ui.R
import com.engin.neksfliz.common_ui.model.AppBarState

@Composable
fun NewAndPopularScreen(onAppBarComposing: (AppBarState) -> Unit, navigateToSearch: () -> Unit) {

    LaunchedEffect(key1 = Unit) {
        onAppBarComposing(createTopAppBar(navigateToSearch))
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "New And Popular Screen")
    }
}

private fun createTopAppBar(navigateToSearch: () -> Unit) = AppBarState(
    title = {
        Text(text = "Yeni Ve Popüler", style = MaterialTheme.typography.titleLarge)
    },
    actions = {
        IconButton(onClick = navigateToSearch) {
            Icon(
                modifier = Modifier.size(28.dp),
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = null,
                tint = Color.White
            )
        }
    }
)

