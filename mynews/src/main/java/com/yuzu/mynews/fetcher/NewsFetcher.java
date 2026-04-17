package com.yuzu.mynews.fetcher;

import com.yuzu.mynews.domain.Article;
import java.util.List;

public interface NewsFetcher {
    List<Article> fetch();
}