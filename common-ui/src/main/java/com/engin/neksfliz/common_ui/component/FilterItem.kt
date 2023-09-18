@file:OptIn(ExperimentalMaterial3Api::class)

package com.engin.neksfliz.common_ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.engin.neksfliz.common_ui.theme.NeksflizTheme
import com.engin.neksfliz.common_ui.theme.spacing

@Composable
fun FilterItem(
    modifier: Modifier = Modifier,
    text: String,
    selectedItem: Boolean,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = if (selectedItem) Color.White.copy(alpha = 0.1f) else Color.Transparent.copy(
                alpha = 0.5f
            ),
            contentColor = Color.White.copy(alpha = 0.5f)
        ),
        border = BorderStroke(1.dp, Color.White),
        onClick = onClick
    ) {
        Text(
            modifier = Modifier.padding(horizontal = MaterialTheme.spacing.medium, vertical = MaterialTheme.spacing.small),
            style = MaterialTheme.typography.labelMedium.copy(
                fontWeight = FontWeight.W400,
                fontSize = 14.sp
            ),
            text = text,
        )
    }
}


@Preview(showBackground = true, backgroundColor = 0)
@Composable
fun FilterItemPrev() {
    var selected by remember { mutableStateOf(false) }
    NeksflizTheme {
        Card(
            modifier = Modifier,
            colors = CardDefaults.cardColors(
                containerColor = if (selected) Color.White.copy(alpha = 0.1f) else Color.Transparent.copy(
                    alpha = 0.5f
                ),
                contentColor = Color.White.copy(alpha = 0.5f)
            ),
            border = BorderStroke(1.dp, Color.White),
            onClick = {
                selected = !selected
            }
        ) {
            Text(
                modifier = Modifier.padding(horizontal = MaterialTheme.spacing.medium, vertical = MaterialTheme.spacing.small),
                style = MaterialTheme.typography.labelLarge.copy(
                    fontWeight = FontWeight.W400,
                    fontSize = 16.sp
                ),
                text = "Diziler",
            )
        }
    }
}