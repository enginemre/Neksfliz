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
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.engin.neksfliz.common_ui.component.shimmerBrush
import com.engin.neksfliz.common_ui.theme.NeksflizTheme
import com.engin.neksfliz.common_ui.theme.spacing


@Composable
fun VerySoonItem() {

}


@Preview(showBackground = true, backgroundColor = 0)
@Composable
fun VerySoonItemPrev() {
    NeksflizTheme {
        Row(horizontalArrangement = Arrangement.spacedBy(MaterialTheme.spacing.medium)) {
            Column(modifier = Modifier.padding(start = MaterialTheme.spacing.medium)) {
                Text(
                    text = "EKİ",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.DarkGray
                )
                Text(
                    text = "05", style = MaterialTheme.typography.displaySmall.copy(
                        color = Color.White,
                        fontWeight = FontWeight.W700
                    )
                )
            }
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
                        OptionItem(icon = Icons.Default.Notifications, text = "Bana Hatırlat")
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
                Spacer(modifier = Modifier.height(MaterialTheme.spacing.small))
                Text(
                    text = listOf("Heyecanlı", "Gizem", "Soygun","Akıl Oyunu","Muzip").joinToString(" * "),
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.White,
                    maxLines = 1,
                    overflow = TextOverflow.Clip
                )
            }
        }

    }
}