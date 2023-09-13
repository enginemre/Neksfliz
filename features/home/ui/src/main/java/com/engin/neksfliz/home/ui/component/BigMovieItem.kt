@file:OptIn(ExperimentalMaterial3Api::class)

package com.engin.neksfliz.home.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.engin.neksfliz.common_ui.component.SmallButton
import com.engin.neksfliz.common_ui.theme.NeksflizTheme
import com.engin.neksfliz.common_ui.theme.spacing
import com.engin.neksfliz.common_ui.R

@Composable
fun BigMovieItem() {

}


@Preview
@Composable
fun BigMovieItemPrev() {
    NeksflizTheme {
        Card(
            modifier = Modifier
                .height(400.dp)
                .fillMaxWidth(),
            onClick = {},
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(
                defaultElevation = MaterialTheme.spacing.large
            ),
        ) {
            Box(Modifier.fillMaxSize()) {

                Row {
                    SmallButton(
                        icon = com.engin.neksfliz.common_ui.R.drawable.ic_play_arrow,
                        text = stringResource(id = R.string.review)
                    ) {
                    }
                    SmallButton(
                        contentColor = Color.White,
                        containerColor = Color.Transparent.copy(0.4f),
                        icon = R.drawable.ic_plus,
                        text = stringResource(id = R.string.my_list)
                    ) {
                    }
                }
            }
        }
    }
}