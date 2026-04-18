package com.yuzu.mynews.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 2000)
    private String content;

    private String url;
    private String source;

    @Enumerated(EnumType.STRING)
    private Category category;

    private LocalDateTime publishedAt;

    protected Article() {} // JPA用

    public Article(String title, String content, String url,
                   String source, Category category, LocalDateTime publishedAt) {
        this.title = title;
        this.content = content;
        this.url = url;
        this.source = source;
        this.category = category;
        this.publishedAt = publishedAt;
    }

    public Category getCategory() { return category; }
    public String getUrl() { return url; }
    public String getTitle() { return title; }
}