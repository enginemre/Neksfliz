@file:OptIn(ExperimentalMaterial3Api::class)

package com.engin.neksfliz.common_ui.component

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.engin.neksfliz.common_ui.R
import com.engin.neksfliz.common_ui.theme.NeksflizTheme

@Composable
fun CloseFilterItem(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    IconButton(
        modifier = modifier,
        onClick = onClick
    ) {
        Icon(
            painterResource(id = R.drawable.ic_cancel),
            contentDescription = null
        )
    }
}

@Preview
@Composable
fun CloseFilterItemPrev() {
    NeksflizTheme {
        IconButton(
            modifier = Modifier,
            onClick = {  }
        ) {
            Icon(
                painterResource(id = R.drawable.ic_cancel),
                contentDescription = null
            )
        }
    }
}