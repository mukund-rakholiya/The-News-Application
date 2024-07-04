package com.mukund.newsapp.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mukund.newsapp.reposetory.NewsReposatory

class NewsNewModelProviderFactory(val app: Application, val newsReposatory: NewsReposatory): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(app, newsReposatory) as T
    }
}