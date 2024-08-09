package com.joeahkim.navigationdrawer

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun DrawerHeader(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 60.dp),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Header", fontSize = 60.sp)

    }
}

@Composable
fun DrawerBody(
    items: List<MenuItem>,
    modifier: Modifier=Modifier,
    itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
    onClick: (MenuItem) -> Unit
){
    LazyColumn (modifier){
        items(items){item ->
            Row ( modifier = Modifier
                .fillMaxSize()
                .clickable {
                    onClick(item)
                }
                .padding(16.dp)
            ){
                Icon(
                    imageVector = item.icon,
                    contentDescription = item.contentDescription
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = item.title,
                    style = itemTextStyle,
                    modifier = Modifier.weight(1f)
                )

            }
        }
    }

}