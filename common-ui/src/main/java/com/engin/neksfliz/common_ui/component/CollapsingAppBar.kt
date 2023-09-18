package com.engin.neksfliz.common_ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.engin.neksfliz.common_ui.R
import com.engin.neksfliz.common_ui.model.CategoryFilter
import com.engin.neksfliz.common_ui.theme.spacing

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun CollapsingToolbar(
    scrollBehaviorPinned: TopAppBarScrollBehavior,
    scrollBehavior: TopAppBarScrollBehavior,
    onNavigateSearch: () -> Unit
) {
    var selectedCategory by remember { mutableStateOf(false) }
    var selectedCategoryName by remember { mutableStateOf<String>("") }
    val selectedCategories = categories.filter { it.text == selectedCategoryName }
    Column {
        TopAppBar(
            title = {
                if (selectedCategory) {
                    Text(
                        modifier = Modifier.padding(horizontal = MaterialTheme.spacing.small),
                        text = selectedCategoryName,
                        style = MaterialTheme.typography.titleLarge
                    )
                }
            },
            navigationIcon = {
                if (selectedCategory) {
                    IconButton(onClick = {
                        selectedCategory = false
                        selectedCategoryName = ""
                    }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null
                        )
                    }
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_neksfliz),
                        contentDescription = null
                    )
                }

            },
            actions = {
                IconButton(onClick = onNavigateSearch) {
                    Icon(
                        modifier = Modifier.size(28.dp),
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Transparent.copy(alpha = 0.7f),
                scrolledContainerColor = Color.Black.copy(alpha = 0.7f)
            ),
            scrollBehavior = scrollBehaviorPinned
        )
        TopAppBar(
            title = {
                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)
                ) {
                    if (selectedCategory) {
                        item {
                            CloseFilterItem(
                                modifier = Modifier.animateItemPlacement()
                            ) {
                                // TODO clear Filter
                                selectedCategory = false
                                selectedCategoryName = ""
                            }
                        }
                        items(selectedCategories) { category ->
                            FilterItem(
                                modifier = Modifier.animateItemPlacement(),
                                text = category.text,
                                selectedItem = category.seleceted
                            ) {
                                // TODO refresh with new filter
                                category.seleceted = selectedCategory
                                selectedCategory = !selectedCategory
                                selectedCategoryName = category.text
                            }
                        }
                    } else {
                        items(categories) { category ->

                            FilterItem(
                                modifier = Modifier.animateItemPlacement(),
                                text = category.text,
                                selectedItem = category.seleceted
                            ) {
                                // TODO refresh with new filter
                                category.seleceted = selectedCategory
                                selectedCategory = !selectedCategory
                                selectedCategoryName = category.text
                            }
                        }
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

val categories = mutableListOf(
    CategoryFilter(1, "Diziler", false),
    CategoryFilter(2, "Filmler", false)
)
