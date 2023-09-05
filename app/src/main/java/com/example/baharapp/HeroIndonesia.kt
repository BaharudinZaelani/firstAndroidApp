package com.example.baharapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class HeroIndonesia(
    val name: String,
    val photo: Int,
    val description: String
): Parcelable
