package com.hager_gomaa.decomposepractise.screentwo.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hager_gomaa.decomposepractise.R

@Composable
fun RowWithBackButton (onClicked: () -> Unit) {
    Row(
    Modifier
    .fillMaxWidth()
    .height(24.dp)
    ) {
        // image button back
        ImageButton {
            onClicked()
        }
        // show  text
        Text(
            modifier = Modifier.align(Alignment.CenterVertically),
            text = stringResource(R.string.images_in_jpeg),
            fontSize = 20.sp
        )
    }
}
