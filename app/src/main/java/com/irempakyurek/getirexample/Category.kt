package com.irempakyurek.getirexample

import java.io.Serializable

data class Category(
    var categoryId: Int, var categoryName: String, var categoryImageName: String, var categoryLowestPrice: Double,
var categoryHeighestPrice: Double, var categoryDescription:String) : Serializable {
}