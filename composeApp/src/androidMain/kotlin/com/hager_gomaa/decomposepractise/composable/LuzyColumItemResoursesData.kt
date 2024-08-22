package com.hager_gomaa.decomposepractise.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.hager_gomaa.decomposepractise.R
import com.hager_gomaa.decomposepractise.screentwo.uistate.ImageIdUiState

@Composable
fun LuzyColumItemResoursesData(list: List<ImageIdUiState>, onClicked: () -> Unit) {
    // luzy colum show list of items
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { Text(stringResource(R.string.all_images_screen_two)) } // show first text
        // retrive data of all items list
        items(list) {
            ImageLocalItem(it)
        }
        // show button in end to go to previous screen
        item {
            ButtonItem(text = stringResource(R.string.back)) {
                onClicked()
            }
        }

    }
}