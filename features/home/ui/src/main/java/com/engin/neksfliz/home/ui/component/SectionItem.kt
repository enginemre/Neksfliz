package com.engin.neksfliz.home.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.engin.neksfliz.common_ui.theme.NeksflizTheme

@Composable
fun SectionItem(
    modifier: Modifier = Modifier,
    text : String,
    color : Color = Color.White
) {
    Row(
        modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = text, style = MaterialTheme.typography.headlineSmall.copy(color = color))
    }
}


@Preview(showBackground = true, backgroundColor = 0)
@Composable
fun SectionItemPrev() {
    NeksflizTheme {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Neksflizde Popüler", style = MaterialTheme.typography.headlineSmall.copy(color = Color.White))
        }
    }
}