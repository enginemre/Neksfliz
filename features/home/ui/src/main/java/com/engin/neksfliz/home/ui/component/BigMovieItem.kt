@file:OptIn(ExperimentalMaterial3Api::class)

package com.engin.neksfliz.home.ui.component

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.engin.neksfliz.common_ui.component.SmallButton
import com.engin.neksfliz.common_ui.theme.NeksflizTheme
import com.engin.neksfliz.common_ui.theme.spacing
import com.engin.neksfliz.common_ui.R

@Composable
fun BigMovieItem(
    bitmap: Bitmap,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .height(500.dp)
            .fillMaxWidth(),
        onClick = onClick,
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(
            defaultElevation = MaterialTheme.spacing.large
        )
    ) {
        Box(Modifier.fillMaxSize()) {
            Image(
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds,
                bitmap = bitmap.asImageBitmap(),
                contentDescription = null
            )
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .height(150.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Transparent.copy(alpha = 0.8f)
                            )
                        )
                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    SmallButton(
                        modifier = Modifier
                            .weight(1f)
                            .padding(
                                horizontal = MaterialTheme.spacing.medium,
                                vertical = MaterialTheme.spacing.small
                            ),
                        icon = R.drawable.ic_play_arrow,
                        text = stringResource(id = R.string.review)
                    ) {
                    }
                    SmallButton(
                        modifier = Modifier
                            .weight(1f)
                            .padding(
                                horizontal = MaterialTheme.spacing.medium,
                                vertical = MaterialTheme.spacing.small
                            ),
                        contentColor = Color.White,
                        containerColor = Color.DarkGray.copy(0.8f),
                        icon = R.drawable.ic_plus,
                        text = stringResource(id = R.string.my_list)
                    ) {
                    }
                }
            }

        }
    }
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
//                AsyncImage(model = "https://i.etsystatic.com/22985714/r/il/e23732/3807163725/il_570xN.3807163725_cuy8.jpg", contentDescription = null)
                Image(
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds,
                    painter = painterResource(id = R.drawable.example_poster),
                    contentDescription = null
                )
                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .height(150.dp)
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Transparent.copy(alpha = 0.8f)
                                )
                            )
                        )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        SmallButton(
                            modifier = Modifier
                                .weight(1f)
                                .padding(
                                    horizontal = MaterialTheme.spacing.medium,
                                    vertical = MaterialTheme.spacing.small
                                ),
                            icon = R.drawable.ic_play_arrow,
                            text = stringResource(id = R.string.review)
                        ) {
                        }
                        SmallButton(
                            modifier = Modifier
                                .weight(1f)
                                .padding(
                                    horizontal = MaterialTheme.spacing.medium,
                                    vertical = MaterialTheme.spacing.small
                                ),
                            contentColor = Color.White,
                            containerColor = Color.DarkGray.copy(0.8f),
                            icon = R.drawable.ic_plus,
                            text = stringResource(id = R.string.my_list)
                        ) {
                        }
                    }
                }

            }
        }
    }
}