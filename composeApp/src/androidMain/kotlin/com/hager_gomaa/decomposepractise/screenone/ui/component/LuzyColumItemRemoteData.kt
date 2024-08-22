package com.hager_gomaa.decomposepractise.screenone.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hager_gomaa.decomposepractise.R
import com.hager_gomaa.decomposepractise.screenone.ui.uistate.ScreenOneUiState

@Composable
fun LuzyColumItemRemoteData(items: ScreenOneUiState, onClicked: () -> Unit) {
    // luzy colum show list of items
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            // make row to show  items in same row
            Row(Modifier.fillMaxWidth()) {
                // show first text
                Text(stringResource(R.string.images_in_jpeg), fontSize = 20.sp)
                //make space to make next item in row end
                Spacer(modifier = Modifier.weight(1f))
                // show text show more to navigate next screem throw clicked fun
                Text(
                    modifier = Modifier.clickable { onClicked() },
                    text = stringResource(R.string.showMore),
                    color = Color(0xFF2A786C),
                    fontSize = 14.sp
                )

            }
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