package com.pbmt.s_news.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.pbmt.s_news.R
import com.pbmt.s_news.db.ArticleDatabase
import com.pbmt.s_news.repository.NewsRepository
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {
    lateinit var viewModel: NewsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val repository=NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory= NewModelProviderFactory(application,repository)
        viewModel=ViewModelProvider(this,viewModelProviderFactory).get(NewsViewModel::class.java)

        bottomNavigation.setupWithNavController(newsNavHostFragment.findNavController())

    }
}