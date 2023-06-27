package com.example.myapplication.retrofit

data class Product (
    val id: Int,
    val title: String,
    val descriptor: String,
    val price: Int,
    val discountPercentage: Float,
    val rating: Int,
    val stock: Float,
    val brand: String,
    val category: String,
    val thumbnail: String,
    val images: List<String>
        )
//здесь то же самое, что и в кинотеатре, то есть инфа об 1 продукте.
