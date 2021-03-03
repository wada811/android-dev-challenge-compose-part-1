package com.example.androiddevchallenge.ui.screen.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.androiddevchallenge.model.Dog

@Composable
fun ListScreen(dogs: List<Dog>) {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(dogs) { dog ->
            ListItem(dog)
        }
    }
}

@Composable
fun ListItem(dog: Dog) {
    Box {
        Column {
            Image(painter = painterResource(id = dog.resId), contentDescription = dog.dogName)
            Text(text = dog.dogName)
        }
    }
}