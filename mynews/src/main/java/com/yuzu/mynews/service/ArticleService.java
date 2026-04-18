package com.yuzu.mynews.service;

import com.yuzu.mynews.domain.*;
import com.yuzu.mynews.dto.ArticleDTO;
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

    public List<ArticleDTO> getAllArticles() {
    return repository.findAll().stream()
        .map(a -> new ArticleDTO(
            a.getTitle(),
            a.getUrl(),
            a.getCategory().name()
        ))
        .toList();
}

    public List<Article> getByCategory(String category) {
        return repository.findByCategory(Category.valueOf(category.toUpperCase()));
    }

    public List<Article> search(String keyword) {
        return repository.findByTitleContaining(keyword);
    }

    public void updateArticles() {
        List<Article> articles = fetcher.fetch();
        repository.saveAll(articles);
    }
}
