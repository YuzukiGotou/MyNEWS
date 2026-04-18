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
            new Article(
                "AIの最新動向",
                "内容",
                "https://example.com/ai",
                "Tech",
                Category.AI,
                LocalDateTime.now()
            ),
            new Article(
                "クラウドの最新トレンド",
                "内容",
                "https://example.com/cloud",
                "Tech",
                Category.CLOUD,
                LocalDateTime.now()
            ),
            new Article(
                "Javaの新機能まとめ",
                "内容",
                "https://example.com/java",
                "Tech",
                Category.WEB,
                LocalDateTime.now()
            )
        );
    }
}
