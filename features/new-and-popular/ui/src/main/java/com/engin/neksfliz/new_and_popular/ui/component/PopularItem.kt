@file:OptIn(ExperimentalGlideComposeApi::class)

package com.engin.neksfliz.new_and_popular.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.engin.neksfliz.common_ui.component.shimmerBrush
import com.engin.neksfliz.common_ui.theme.NeksflizTheme
import com.engin.neksfliz.common_ui.theme.spacing

@Preview
@Composable
fun PopularItem(
    imageUrl: String,
    name: String,
    description: String,
) {
    Column {
        GlideImage(
            model = "https://i.etsystatic.com/22985714/r/il/e23732/3807163725/il_570xN.3807163725_cuy8.jpg",
            modifier = Modifier
                .background(shimmerBrush(targetValue = 1300f, showShimmer = true))
                .width(150.dp)
                .heightIn(min = 220.dp)
                .align(Alignment.CenterHorizontally),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
        Text(text = description)
    }
}


@Preview(showBackground = true, backgroundColor = 0)
@Composable
fun PopularItemPrev() {
    NeksflizTheme {
        Column {
            GlideImage(
                model = "https://i.etsystatic.com/22985714/r/il/e23732/3807163725/il_570xN.3807163725_cuy8.jpg",
                modifier = Modifier
                    .background(shimmerBrush(targetValue = 1300f, showShimmer = true))
                    .fillMaxWidth()
                    .heightIn(min = 220.dp)
                    .align(Alignment.CenterHorizontally),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "BlackList",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White
                )
                Row(modifier = Modifier.padding(horizontal = MaterialTheme.spacing.medium)) {
                    OptionItem(icon = Icons.Default.Share, text = "Paylaş")
                    Spacer(modifier = Modifier.width(MaterialTheme.spacing.large))
                    OptionItem(icon = Icons.Default.Add, text = "Listem")
                    Spacer(modifier = Modifier.width(MaterialTheme.spacing.large))
                    OptionItem(icon = Icons.Default.Info, text = "Bilgi")
                }
            }
            Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
            Text(
                text = "ajsnfdjksadfjasdfjkdafjkaksdfmkadfsmkladfsmklfaksdmkmlfsdaklmfasdklmafsdklmafsdkmlksfdalklmfsdklmasfdkmlsfdklmafsdklmaklsdfmklamsdfklmasdfklmasdfklmasdfklmasdkflmalkmsdflkmsfdkmlasdfklmsfdkm",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.DarkGray,
                overflow = TextOverflow.Ellipsis,
                maxLines = 3
            )
        }
    }
}


@Composable
fun OptionItem(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.White
        )
        Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
        Text(
            text = text, style = MaterialTheme.typography.bodySmall.copy(
                color = Color.DarkGray
            )
        )
    }
}


@Preview(showBackground = true, backgroundColor = 0)
@Composable
fun OptionItemPrev() {
    NeksflizTheme {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = null,
                tint = Color.White
            )
            Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
            Text(
                text = "Bana Hatırlat", style = MaterialTheme.typography.bodySmall.copy(
                    color = Color.DarkGray
                )
            )
        }
    }
}