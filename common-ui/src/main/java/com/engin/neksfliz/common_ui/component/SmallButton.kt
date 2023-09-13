package com.engin.neksfliz.common_ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.engin.neksfliz.common_ui.R
import com.engin.neksfliz.common_ui.theme.NeksflizTheme
import com.engin.neksfliz.common_ui.theme.spacing

@Composable
fun SmallButton(
    modifier: Modifier = Modifier,
    containerColor: Color = Color.White,
    contentColor: Color = Color.Black,
    @DrawableRes icon: Int? = null,
    text: String,
    onClick: () -> Unit,
) {
    NeksflizTheme {
        ElevatedButton(
            onClick = onClick,
            modifier = modifier,
            shape = RoundedCornerShape(MaterialTheme.spacing.extraSmall),
            colors = ButtonDefaults.elevatedButtonColors(
                containerColor = containerColor,
                contentColor = contentColor,
                )
        ) {
            icon?.let {
                Icon(
                    painter = painterResource(id = R.drawable.ic_play_arrow),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.size(MaterialTheme.spacing.extraSmall))
            }
            Text(text = text, style = MaterialTheme.typography.labelLarge)
        }
    }
}


@Preview()
@Composable
fun SmallButtonPrev() {
    NeksflizTheme {
        ElevatedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier,
            shape = RoundedCornerShape(MaterialTheme.spacing.extraSmall),
            colors = ButtonDefaults.elevatedButtonColors(
                containerColor = Color.White,
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_play_arrow),
                contentDescription = null
            )
            Spacer(modifier = Modifier.size(MaterialTheme.spacing.extraSmall))
            Text(text = "Oynat", style = MaterialTheme.typography.labelLarge)
        }
    }
}