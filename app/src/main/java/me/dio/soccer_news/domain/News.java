package me.dio.soccer_news.domain;

public class News {
    private String title;
    private String description;
    private String image;
    private String link;

    public String getLink() {return link;}

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {return image;}

    public void setImage(String img) {this.image = img;}

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
