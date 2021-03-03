package com.example.androiddevchallenge.ui.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.androiddevchallenge.model.Dog

@Composable
fun DetailScreen(dog: Dog) {
    Column {
        Image(painter = painterResource(id = dog.resId), contentDescription = dog.dogName)
        Text(text = dog.dogName)
    }
}