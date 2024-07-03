package com.mukund.newsapp.reposetory

import com.mukund.newsapp.api.RetrifitInstance
import com.mukund.newsapp.db.ArticleDatabase
import com.mukund.newsapp.models.Article

class NewsReposatory (val db: ArticleDatabase){
    suspend fun getHeadlines(countryCode: String, pageNumber: Int) =
        RetrifitInstance.api.getHeadLines(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrifitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getFavouriteNews() = db.getArticleDao().getAllArticles()

    suspend fun deldeteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}