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
package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.R

enum class Dog(val dogName: String, val resId: Int, val url: String) {
    GreatDane("Great Dane", R.drawable.dog_great_dane, "https://www.irasutoya.com/2020/07/blog-post_700.html"),
    OldEnglishSheepdog("Old English Sheepdog", R.drawable.dog_old_english_sheepdog, "https://www.irasutoya.com/2017/12/blog-post_31.html"),
    Dachshund("Dachshund", R.drawable.dog_dachshund_choumou, "https://www.irasutoya.com/2016/10/blog-post_204.html"),
    BassetHound("Basset Hound", R.drawable.dog_basset_hound, "https://www.irasutoya.com/2016/09/blog-post_303.html"),
    Akitainu("Akitainu", R.drawable.dog_akitainu, "https://www.irasutoya.com/2016/07/blog-post_26.html"),
    BostonTerrier("Boston Terrier", R.drawable.dog_akitainu, "https://www.irasutoya.com/2016/03/blog-post_637.html"),
    WestHighlandWhiteTerrier("West Highland White Terrier", R.drawable.dog_west_highland_white_terrier, "https://www.irasutoya.com/2015/06/blog-post_42.html"),
    Hokkaidouken("Hokkaidouken", R.drawable.dog_hokkaidouken, "https://www.irasutoya.com/2014/12/blog-post_933.html"),
    BorderCollie("Border Collie", R.drawable.dog_border_collie, "https://www.irasutoya.com/2014/10/blog-post_45.html"),
    SiberianHusky("Siberian Husky", R.drawable.dog_siberian_husky, "https://www.irasutoya.com/2014/02/blog-post_25.html"),
    ShihTzu("Shih Tzu", R.drawable.dog_shih_tzu, "https://www.irasutoya.com/2014/02/blog-post_24.html"),
    Pug("Pug", R.drawable.dog_pug, "https://www.irasutoya.com/2014/02/blog-post_21.html"),
    Poodle("Poodle", R.drawable.dog_poodle, "https://www.irasutoya.com/2014/02/blog-post_20.html"),
    Pomeranian("Pomeranian", R.drawable.dog_pomeranian, "https://www.irasutoya.com/2014/02/blog-post_19.html"),
    Papillon("Papillon", R.drawable.dog_papillon, "https://www.irasutoya.com/2014/02/blog-post_18.html"),
    MiniatureSchnauzer("Miniature Schnauzer", R.drawable.dog_miniature_schnauzer, "https://www.irasutoya.com/2014/02/blog-post_17.html"),
}
