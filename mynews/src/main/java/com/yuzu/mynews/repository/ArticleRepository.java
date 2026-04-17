package com.yuzu.mynews.repository;

import com.yuzu.mynews.domain.Article;
import java.util.List;

public interface ArticleRepository {
    List<Article> findAll();
    List<Article> findByCategory(String category);
    List<Article> search(String keyword);
    void saveAll(List<Article> articles);
}