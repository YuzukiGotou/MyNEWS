package com.yuzu.mynews.service;

import com.yuzu.mynews.domain.Article;
import com.yuzu.mynews.fetcher.NewsFetcher;
import com.yuzu.mynews.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository repository;
    private final NewsFetcher fetcher;

    public ArticleService(ArticleRepository repository, NewsFetcher fetcher) {
        this.repository = repository;
        this.fetcher = fetcher;
    }

    public List<Article> getAllArticles() {
        return repository.findAll();
    }

    public List<Article> getByCategory(String category) {
        return repository.findByCategory(category);
    }

    public List<Article> search(String keyword) {
        return repository.search(keyword);
    }

    public void updateArticles() {
        List<Article> articles = fetcher.fetch();
        repository.saveAll(articles);
    }
}