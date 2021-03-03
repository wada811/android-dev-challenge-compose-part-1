package com.example.androiddevchallenge.ui.screen.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
fun ListScreen(dogs: List<Dog>, navigateDetail: (Dog) -> Unit) {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(dogs) { dog ->
            ListItem(dog, navigateDetail)
        }
    }
}

@Composable
fun ListItem(dog: Dog, navigateDetail: (Dog) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { navigateDetail(dog) }
    ) {
        Image(painter = painterResource(id = dog.resId), contentDescription = dog.dogName)
        Text(text = dog.dogName)
    }
}