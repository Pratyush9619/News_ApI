package com.example.news_api;

public class ModelClass {

    String title , description ,publishedAt, urlToImage , author;

    public ModelClass(String title, String description, String publishedAt, String urlToImage, String author) {
        this.title = title;
        this.description = description;
        this.publishedAt = publishedAt;
        this.urlToImage = urlToImage;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
