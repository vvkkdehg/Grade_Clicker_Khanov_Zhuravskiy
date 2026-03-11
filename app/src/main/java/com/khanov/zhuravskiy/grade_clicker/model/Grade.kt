package com.khanov.zhuravskiy.grade_clicker.model

import android.media.Image
import androidx.annotation.DrawableRes

data class Grade(
    @DrawableRes val imageId: Int,
    val pointsPerClick: Int,
    val threshold: Int
)