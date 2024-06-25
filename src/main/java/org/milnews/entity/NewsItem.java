package org.milnews.entity;

import lombok.Data;

@Data
public class NewsItem {

    private String title;
    private String imageUrl;
    private String author;
    private String content;

}
