package module04.lesson05;

public class Song {
    private String title;
    private double duration;
    private Author author;

    public Song(String title, double duration, Author author) {
        this.title = title;
        this.duration = duration;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public Author getAuthor() {
        return author;
    }
}
