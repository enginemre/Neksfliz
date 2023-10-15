package com.engin.neksfliz.new_and_popular.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.engin.neksfliz.new_and_popular.domain.model.Category
import com.engin.neksfliz.new_and_popular.ui.component.CategoryHeader
import com.engin.neksfliz.new_and_popular.ui.component.PopularItemPrev
import com.engin.neksfliz.new_and_popular.ui.component.VerySoonItemPrev

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun NewAndPopularScreen(onAppBarComposing: (AppBarState) -> Unit, navigateToSearch: () -> Unit) {

    LaunchedEffect(key1 = Unit) {
        onAppBarComposing(createTopAppBar(navigateToSearch))
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 35.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        categories.forEach {
            stickyHeader {
                CategoryHeader(name = it.name)
            }
            items(it.items) { ses ->
                when(it.name){
                    "🍿 Çok yakında" -> {
                        VerySoonItemPrev()
                    }
                    "🎉 En Sevilenler" -> {
                        PopularItemPrev()
                    }
                    "🔥 Herkes Bunu İzliyor " -> {
                        PopularItemPrev()
                    }
                }
            }
        }

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

val categories = listOf(
    Category(
        name = "🍿 Çok yakında",
        items = (1..20).map { it.toString() }
    ),
    Category(
        name = "🎉 En Sevilenler",
        items = (1..40).map { it.toString() }
    ),
    Category(
        name = "🔥 Herkes Bunu İzliyor ",
        items = (1..10).map { it.toString() }
    )
)

