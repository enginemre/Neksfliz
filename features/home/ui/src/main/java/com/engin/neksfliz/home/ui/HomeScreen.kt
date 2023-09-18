package com.engin.neksfliz.home.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.engin.neksfliz.common_ui.theme.NeksflizTheme
import com.engin.neksfliz.common_ui.theme.spacing
import com.engin.neksfliz.home.ui.component.BigMovieItem
import com.engin.neksfliz.home.ui.component.BigMovieItemPrev
import com.engin.neksfliz.home.ui.component.MediumMovieItem
import com.engin.neksfliz.home.ui.component.MediumMovieItemPrev
import com.engin.neksfliz.home.ui.component.SectionItem
import com.engin.neksfliz.home.ui.component.SmallMovieItem
import com.engin.neksfliz.home.ui.component.SmallPrevItem
import com.engin.neksfliz.home.ui.model.Movie
import com.engin.neksfliz.home.ui.model.Section


val fakeList = listOf<Section>(
    Section(
        type = 0,
        sectionText = "Neksflizde Popüler",
        listOf(
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
        )
    ),
    Section(
        type = 0,
        sectionText = "Aksiyon Filmleri",
        listOf(
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
        )
    ),
    Section(
        type = 0,
        sectionText = "Aksiyon Filmleri",
        listOf(
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
        )
    ),
    Section(
        type = 1,
        sectionText = "Gerilim Filmleri",
        listOf(
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
        )
    ),
    Section(
        type = 0,
        sectionText = "Aksiyon Filmleri",
        listOf(
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
        )
    ),
    Section(
        type = 0,
        sectionText = "Aksiyon Filmleri",
        listOf(
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
        )
    ),
    Section(
        type = 1,
        sectionText = "Gerilim Filmleri",
        listOf(
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
            Movie("https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"),
        )
    ),

    )

@Composable
fun HomeScreen(
    initialPadding: Dp = 0.dp,
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        contentPadding = PaddingValues(top = initialPadding, bottom = MaterialTheme.spacing.small)
    ) {
        item {
            BigMovieItem(
                modifier = Modifier.padding(horizontal = MaterialTheme.spacing.medium),
                imageUrl = "https://i.etsystatic.com/13367669/r/il/db21fd/2198543930/il_570xN.2198543930_4qne.jpg"
            ) {

            }
            Spacer(modifier = Modifier.height(MaterialTheme.spacing.medium))
        }

        items(fakeList) {
            Column(Modifier.padding(vertical = MaterialTheme.spacing.small)) {
                SectionItem(
                    Modifier.padding(start = MaterialTheme.spacing.small),
                    text = it.sectionText
                )
                Spacer(Modifier.height(MaterialTheme.spacing.extraSmall))

                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(start = MaterialTheme.spacing.small),
                    horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraSmall)
                ) {
                    items(it.movies) { movie ->
                        when (it.type) {
                            0 -> {
                                SmallMovieItem(
                                    movie.imageUrl
                                ) {}
                            }

                            else -> {
                                MediumMovieItem(imageUrl = movie.imageUrl) {

                                }
                            }
                        }

                    }
                }
            }
        }
    }
}


@Preview()
@Composable
fun HomeScreenPrev() {
    NeksflizTheme {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(top = 52.dp)
        ) {
            item {
                BigMovieItemPrev()
                Spacer(modifier = Modifier.height(MaterialTheme.spacing.medium))
            }
            items(fakeList) {
                Column(Modifier.padding(vertical = MaterialTheme.spacing.small)) {
                    SectionItem(
                        Modifier.padding(start = MaterialTheme.spacing.small),
                        text = it.sectionText
                    )
                    Spacer(Modifier.height(MaterialTheme.spacing.extraSmall))
                    LazyRow(
                        modifier = Modifier.fillMaxWidth(),
                        contentPadding = PaddingValues(start = MaterialTheme.spacing.small),
                        horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.extraSmall)
                    ) {
                        items(it.movies) { movie ->
                            when (it.type) {
                                0 -> {
                                    SmallPrevItem()
                                }
                                else -> {
                                    MediumMovieItemPrev()
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
