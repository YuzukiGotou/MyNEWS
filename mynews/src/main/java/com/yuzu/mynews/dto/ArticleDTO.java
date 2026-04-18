package com.yuzu.mynews.dto;

public class ArticleDTO {

    private String title;
    private String url;
    private String category;

    public ArticleDTO(String title, String url, String category) {
        this.title = title;
        this.url = url;
        this.category = category;
    }

    public String getTitle() { return title; }
    public String getUrl() { return url; }
    public String getCategory() { return category; }
}