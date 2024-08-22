package com.hager_gomaa.decomposepractise.screenone.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.hager_gomaa.decomposepractise.R

@Composable
fun RowItem( onClicked: () -> Unit){
// make row to show  items in same row
Row(Modifier.fillMaxWidth()) {
    // show first text
    Text(stringResource(R.string.images_in_jpeg), fontSize = 20.sp)
    //make space to make next item in row end
    Spacer(modifier = Modifier.weight(1f))
    // show text show more to navigate next screen throw clicked fun
    Text(
        modifier = Modifier.clickable { onClicked() },
        text = stringResource(R.string.showMore),
        color = Color(0xFF2A786C),
        fontSize = 14.sp
    )

}}