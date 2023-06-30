package com.example.articles

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Image(
    val imageSrc: Int,
    val imageTitle: String,
    val imageDesc: String
) : Parcelable

