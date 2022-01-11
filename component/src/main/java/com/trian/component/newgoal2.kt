package com.trian.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Newgoal() {
    var text1 by remember { mutableStateOf("Water consumption") }
    var text2 by remember { mutableStateOf("Drink 5 cup water") }
    var text3 by remember { mutableStateOf("Every Day") }
    var text4 by remember { mutableStateOf("12 Months") }

    Column {
        Row {
            Text(
                text = "New goal",
                modifier = Modifier
                    .height(35.dp)
                    .width(116.dp),
                fontSize = 24.sp
            )
            Spacer(
                modifier = Modifier
                    .width(100.dp)

            )
            Button(
                onClick = { /* ... */ },
                // Uses ButtonDefaults.ContentPadding by default
                contentPadding = PaddingValues(
                    start = 20.dp,
                    top = 12.dp,
                    end = 20.dp,
                    bottom = 12.dp
                )

            ) {
                // Inner content including an icon and a text label
                Icon(
                    Icons.Filled.Close,
                    contentDescription = "",
                    modifier = Modifier.size(ButtonDefaults.IconSize)

                )


            }
        }
        TextField(
            value = text1,
            onValueChange = { text1 = it },
            label = { Text("Goal title") }
        )
        Spacer(
            modifier = Modifier.height(30.dp))
        TextField(
            value = text2,
            onValueChange = { text2 = it },
            label = { Text("Goal Description") }
        )
        Spacer(
            modifier = Modifier.height(30.dp))
        TextField(
            value = text3,
            onValueChange = { text3 = it },
            label = { Text("Reminder") }
        )
        Spacer(
            modifier = Modifier.height(30.dp))
        TextField(
            value = text4,
            onValueChange = { text4 = it },
            label = { Text("Maturity date") })
        Text(text = "Goal Preview",
            modifier= Modifier,fontSize = 24.sp)

        Row(modifier=Modifier.background(Color.LightGray)) {
            Image(painter = painterResource(id =R.drawable.heart_plus), contentDescription = null, modifier= Modifier.size(45.dp))
            Column {
                Text(text = "Water Consumption")
                Text(text = "Drink 5 cup water")
        }


    }

    Row(modifier=Modifier.background(Color.LightGray)) {
        Image(painter = painterResource(id =R.drawable.icon), contentDescription =null, modifier= Modifier
            .size(20.dp)
            .background(Color.LightGray))
        Text(text = "Deadline")
        Text(text = "1 January 2023")
    }

    }
}

@Composable
fun Page(){
    var text1 by remember { mutableStateOf("Water consumption") }
    var text2 by remember { mutableStateOf("Drink 5 cup water") }
    var text3 by remember { mutableStateOf("Every Day") }
    var text4 by remember { mutableStateOf("12 Months") }
    val items = listOf(
        NavigationItem.Home,
    )

    Scaffold(topBar = {
        Row {
        Text(
            text = "New goal",
            modifier = Modifier
                .height(35.dp)
                .width(116.dp),
            fontSize = 24.sp
        )
        Spacer(
            modifier = Modifier
                .width(220.dp)

        )
        Button(
            onClick = { /* ... */ },
            // Uses ButtonDefaults.ContentPadding by default
            contentPadding = PaddingValues(
                start = 20.dp,
                top = 12.dp,
                end = 20.dp,
                bottom = 12.dp
            )

        ) {
            // Inner content including an icon and a text label
            Icon(
                Icons.Filled.Close,
                contentDescription = "",
                modifier = Modifier.size(ButtonDefaults.IconSize)

            )


        }
    }

    },
    bottomBar = {
        BottomNavigation(
        backgroundColor =Color.Blue,
        contentColor = Color.White
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = false,
                onClick = {
                    /* Add code later */
                }
            )
        }
    }


    }
    ) {
        Column() {
            Spacer(
                modifier = Modifier.height(100.dp))
            TextField(
                value = text1,
                onValueChange = { text1 = it },
                label = { Text("Goal title") }
            )
            Spacer(
                modifier = Modifier.height(100.dp))
            TextField(
                value = text2,
                onValueChange = { text2 = it },
                label = { Text("Goal Description") }
            )
            Spacer(
                modifier = Modifier.height(100.dp))
            TextField(
                value = text3,
                onValueChange = { text3 = it },
                label = { Text("Reminder") }
            )
            Spacer(
                modifier = Modifier.height(100.dp))
            TextField(
                value = text4,
                onValueChange = { text4 = it },
                label = { Text("Maturity date") })
            Spacer(
                modifier = Modifier.height(50.dp))
            Text(text = "Goal Preview",
                modifier= Modifier,fontSize = 24.sp)
            Spacer(
                modifier = Modifier.height(1.dp))
            Row(modifier=Modifier.background(Color.LightGray)) {
                Image(painter = painterResource(id =R.drawable.heart_plus), contentDescription = null, modifier= Modifier.size(45.dp))
                Column {
                    Text(text = "Water Consumption")
                    Text(text = "Drink 5 cup water")
                }


            }

            Row(modifier=Modifier.background(Color.LightGray)) {
                Image(painter = painterResource(id =R.drawable.icon), contentDescription =null, modifier= Modifier
                    .size(20.dp)
                    .background(Color.LightGray))
                Text(text = "Deadline")
                Text(text = "1 January 2023")
            }
        }
    }
}

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.icon, "Home")
}














        @Preview(showBackground = true)
        @Composable
        fun PreviePage() {
           Page                           ()

        }























