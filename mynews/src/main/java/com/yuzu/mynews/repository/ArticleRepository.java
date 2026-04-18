package com.yuzu.mynews.repository;

import com.yuzu.mynews.domain.Article;
import com.yuzu.mynews.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findByCategory(Category category);

    List<Article> findByTitleContaining(String keyword);
}