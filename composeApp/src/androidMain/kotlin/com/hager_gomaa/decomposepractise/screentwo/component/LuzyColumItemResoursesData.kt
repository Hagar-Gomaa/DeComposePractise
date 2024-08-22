package com.hager_gomaa.decomposepractise.screentwo.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        item {
            Row(Modifier.fillMaxWidth().height(24.dp)) {
               // image button back
                ImageButton {
                    onClicked()
                }
                // show  text
                Text(
                    modifier = Modifier.align(Alignment.CenterVertically),
                    text = stringResource(R.string.all_images_screen_two),
                    fontSize = 20.sp
                )
            }
        }

        // retrive data of all items list
        items(list) {
            ImageLocalItem(it)
        }
        // show button in end to go to previous screen


    }
}