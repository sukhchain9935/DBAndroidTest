package com.example.vollyexample;

public class Model {
    public String title, category, thumbNailUrl;

    public Model() {

    }
    public Model(String title, String category, String thumbNailUrl) {
        this.title = title;
        this.category = category;
        this.thumbNailUrl = thumbNailUrl;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getThumbNailUrl() {
        return thumbNailUrl;
    }
    public void setThumbNailUrl(String thumbNailUrl) {
        this.thumbNailUrl = thumbNailUrl;
    }
}
