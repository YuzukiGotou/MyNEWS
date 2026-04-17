package com.yuzu.mynews.repository;

import com.yuzu.mynews.domain.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class InMemoryArticleRepository implements ArticleRepository {

    private final List<Article> articles = new ArrayList<>();

    @Override
    public List<Article> findAll() {
        return articles;
    }

    @Override
    public List<Article> findByCategory(String category) {
        return articles.stream()
                .filter(a -> a.getCategory().name().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    @Override
    public List<Article> search(String keyword) {
        return articles.stream()
                .filter(a -> a.getTitle().contains(keyword))
                .collect(Collectors.toList());
    }

    @Override
    public void saveAll(List<Article> newArticles) {
        articles.addAll(newArticles);
    }
}