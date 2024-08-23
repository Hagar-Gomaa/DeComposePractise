package com.hager_gomaa.decomposepractise.screenone.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hager_gomaa.decomposepractise.R
import com.hager_gomaa.decomposepractise.screenone.uistate.ScreenOneUiState

@Composable
fun LuzyColumItemRemoteData(items: ScreenOneUiState, onClicked: () -> Unit) {
    // luzy colum show list of items
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        //show row
        item {
            RowWithTwoText(onClicked = { onClicked() })
        }
        // retrive data of all items list
        items(items.imageJpegList) {
            ImageItem(it)
        }
        // space
        item {
            Spacer(modifier = Modifier.height(40.dp))
        }
        // show  text
        item {
            Text(
                text = stringResource(R.string.images_in_svg),
                fontSize = 20.sp
            )
        }
        // retrive data of all items list
        items(items.imageSvgList) {
            ImageItem(it)
        }

    }
}