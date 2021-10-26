package com.pbmt.s_recipe.`interface`

import com.pbmt.s_recipe.entities.Category
import com.pbmt.s_recipe.entities.Meal
import com.pbmt.s_recipe.entities.MealResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {

    @GET("categories.php")
    fun getCategoryList(): Call<Category>



    @GET("filter.php")
    fun getMealList(@Query("c") category: String): Call<Meal>



    @GET("lookup.php")
    fun getSpecificItem(@Query("i") id: String): Call<MealResponse>





}