package com.thebinarysoul.aiarticles;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Article {
    @Getter
    private final String description;
    @Getter
    private final String link;
    private final long id;
    private volatile static long count = 1;

    public Article(final String description, final String link) {
        this.description = description;
        this.link = link;
        this.id = ++count;
    }
}
