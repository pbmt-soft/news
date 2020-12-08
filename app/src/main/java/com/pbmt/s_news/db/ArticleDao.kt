package com.pbmt.s_news.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.pbmt.s_news.other.Article

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(
        article: Article
    ):Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}