package library;

import staff.Cleaner;

public abstract class Bookshelf {
    protected String title;
    private String genre;
    private String author;
    private int date;
    private Cleaner cleaner;

    public Bookshelf(String title, String genre, String author, int date) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.date = date;
    }

    /// getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

//methods.

    public String loan() {
        return "You have loaned " + (this.title);
    }

    public void cleanUp() {
        this.cleaner.cleanUp();
    }
}