@file:OptIn(ExperimentalMaterial3Api::class)

package com.engin.neksfliz.home.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.engin.neksfliz.common_ui.R
import com.engin.neksfliz.common_ui.theme.NeksflizTheme

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun MediumMovieItem(
    imageUrl: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier.size(125.dp, 200.dp),
        shape = RoundedCornerShape(2.dp),
        onClick = onClick
    ) {
        GlideImage(
            model = imageUrl,
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
    }
}


@Preview
@Composable
fun MediumMovieItemPrev() {
    NeksflizTheme {
        Card(
            modifier = Modifier.size(125.dp, 200.dp),
            shape = RoundedCornerShape(2.dp),
            onClick = { /*TODO*/ }) {
            Image(
                contentScale = ContentScale.FillBounds,
                painter = painterResource(id = R.drawable.example_poster),
                contentDescription = null
            )
        }
    }
}