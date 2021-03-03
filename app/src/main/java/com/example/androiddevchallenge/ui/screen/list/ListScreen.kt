/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
        Image(
            painter = painterResource(id = dog.resId),
            contentDescription = dog.dogName
        )
        Text(text = dog.dogName)
    }
}
