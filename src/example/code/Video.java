package example.code;

import example.code.openclosed.Category;

public class Video {
    private String title;
    private int duration;
    private int likes;
    private int views;

    public Video(int likes, int views) {
        this.likes = likes;
        this.views = views;
    }

    private Category category;

    public Video(int duration, int likes, int views, Category category) {
        this.duration = duration;
        this.likes = likes;
        this.views = views;
        this.category = category;
    }

    public double getNumberOfHoursPlayed() {
        return (duration / 3600.0) * views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
