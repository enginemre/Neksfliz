package com.engin.neksfliz.new_and_popular.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.engin.neksfliz.common_ui.theme.NeksflizTheme
import com.engin.neksfliz.common_ui.theme.spacing

@Composable
fun CategoryHeader(
    modifier: Modifier = Modifier,
    name: String
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.padding(
                vertical = MaterialTheme.spacing.large,
                horizontal = MaterialTheme.spacing.medium
            ),
            text = name,
            style = MaterialTheme.typography.titleLarge.copy(
                color = Color.White
            )
        )
    }
}


@Preview(showBackground = true, backgroundColor = 0)
@Composable
fun CategoryHeaderPrev() {
    NeksflizTheme {
        Column(
            modifier = Modifier.fillMaxWidth().background(color = Color.Black)
        ) {
            Text(
                modifier = Modifier.padding(
                    vertical = MaterialTheme.spacing.large,
                    horizontal = MaterialTheme.spacing.medium
                ),
                text = "🍿 Çok Yakında",
                style = MaterialTheme.typography.titleLarge.copy(
                    color = Color.White
                )
            )
        }
    }
}