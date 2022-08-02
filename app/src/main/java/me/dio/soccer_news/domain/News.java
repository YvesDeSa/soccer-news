package me.dio.soccer_news.domain;

public class News {
    private String title;
    private String description;
    private String img;
    private String link;

    public String getLink() {return link;}

    public void setLink(String link) {
        this.link = link;
    }

    public String getImg() {return img;}

    public void setImg(String img) {this.img = img;}

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
}
