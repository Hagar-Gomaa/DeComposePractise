package com.hager_gomaa.decomposepractise.screentwo.component

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.hager_gomaa.decomposepractise.R

@Composable
fun ImageButton(onClick: () -> Unit) {
    IconButton(onClick = onClick) {
        Icon(
            painter = painterResource(id = R.drawable.ic_back), contentDescription = null
        )
    }
}