package com.yuzu.mynews.fetcher;

import com.yuzu.mynews.domain.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class DummyNewsFetcher implements NewsFetcher {

    @Override
    public List<Article> fetch() {
        return List.of(
            new Article(1L, "AIの最新動向", "内容", "https://example.com",
                    "Tech", Category.AI, LocalDateTime.now())
        );
    }
}