package Genre;

import library.Bookshelf;

import java.util.ArrayList;

public abstract class Genre {
    private String title;
    private String author;
    protected ArrayList<Bookshelf> bookshelves;
    private boolean available;


    public Genre(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
        this.bookshelves = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<Bookshelf> getBookshelves() {
        return bookshelves;
    }

    public void setBookshelves(ArrayList<Bookshelf> bookshelves) {
        this.bookshelves = bookshelves;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    public void available() {
        this.available = true;
    }

    public void unavailable() {
        this.available = false;
    }

}
