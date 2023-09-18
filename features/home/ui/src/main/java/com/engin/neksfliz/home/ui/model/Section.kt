package com.engin.neksfliz.home.ui.model

import androidx.compose.runtime.Stable
import com.engin.neksfliz.common_ui.util.UIModel

@Stable
data class Section(
    val type : Int,
    val sectionText : String,
    val movies : List<Movie>
) : UIModel
