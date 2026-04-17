package com.yuzu.mynews.domain;

import java.time.LocalDateTime;

public class Article {

    private Long id;
    private String title;
    private String content;
    private String url;
    private String source;
    private Category category;
    private LocalDateTime publishedAt;

    public Article(Long id, String title, String content, String url,
                   String source, Category category, LocalDateTime publishedAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.url = url;
        this.source = source;
        this.category = category;
        this.publishedAt = publishedAt;
    }

    public boolean isRecent() {
        return publishedAt.isAfter(LocalDateTime.now().minusDays(1));
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }

    public String getSource() {
        return source;
    }

    public Category getCategory() {
        return category;
    }
}