package com.okahya.imagesearchapp.api

import com.okahya.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)