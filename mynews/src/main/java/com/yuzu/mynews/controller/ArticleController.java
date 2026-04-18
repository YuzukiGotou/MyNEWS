package com.yuzu.mynews.controller;

import com.yuzu.mynews.domain.Article;
import com.yuzu.mynews.dto.ArticleDTO;
import com.yuzu.mynews.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService service;

    public ArticleController(ArticleService service) {
        this.service = service;
    }

    @GetMapping("/test")
    public String test() {
        return "OK";
    }

    // 一覧取得
    @GetMapping
    public List<ArticleDTO> getAll() {
        return service.getAllArticles();
    }

    // カテゴリ検索
    @GetMapping("/category")
    public List<Article> getByCategory(@RequestParam String category) {
        return service.getByCategory(category);
    }

    // キーワード検索
    @GetMapping("/search")
    public List<Article> search(@RequestParam String keyword) {
        return service.search(keyword);
    }

    // 手動更新
    @PostMapping("/update")
    public String update() {
        service.updateArticles();
        return "updated";
    }
}