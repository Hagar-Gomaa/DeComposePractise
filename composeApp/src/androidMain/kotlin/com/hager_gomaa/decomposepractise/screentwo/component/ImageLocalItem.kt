package com.hager_gomaa.decomposepractise.screentwo.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.hager_gomaa.decomposepractise.screentwo.uistate.ImageIdUiState


@Composable
fun ImageLocalItem(item: ImageIdUiState) {
    Column(
        modifier = Modifier.fillMaxSize()

    ) {
        // load image with coil from resource id
        AsyncImage(
            model = coil.request.ImageRequest.Builder(LocalContext.current).data(item.id).build(),
            contentDescription = "icon",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth() // make it take screen width
                .height(300.dp) //make it take 300 dp in height
                .clip(RoundedCornerShape(16.dp)) // make with corner radios
        )
    }
}
