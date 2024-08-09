package com.joeahkim.navigationdrawer

import android.graphics.drawable.Icon
import android.icu.text.CaseMap.Title
import androidx.compose.ui.graphics.vector.ImageVector

data class MenuItem(
    val id: String,
    val title: String,
    val contentDescription: String,
    val icon: ImageVector
)
