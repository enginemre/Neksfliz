package com.engin.neksfliz.common_ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.engin.neksfliz.common_ui.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CollapsingToolbar(
    scrollBehaviorPinned: TopAppBarScrollBehavior,
    scrollBehavior: TopAppBarScrollBehavior,
    actions: (RowScope.() -> Unit)? = null,
) {
    Column {
        TopAppBar(
            title = {},
            navigationIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_neksfliz),
                    contentDescription = null
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Transparent,
                scrolledContainerColor = Color.Black.copy(alpha = 0.7f)
            ),
            scrollBehavior = scrollBehaviorPinned
        )
        TopAppBar(
            title = {
                LazyRow {
                    items(3) {
                        Text(
                            text = "item ${it.toString()}",
                            modifier = Modifier.padding(horizontal = 12.dp)
                        )
                    }
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Transparent,
                scrolledContainerColor = Color.Black.copy(alpha = 0.7f)
            ),
            scrollBehavior = scrollBehavior
        )
    }


}
