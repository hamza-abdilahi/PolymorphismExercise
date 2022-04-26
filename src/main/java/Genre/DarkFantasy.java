package Genre;

import library.Bookshelf;

public class DarkFantasy extends Genre{

    public DarkFantasy(String title, String author) {
        super(title, author);
    }

    public void addBookshelf(Bookshelf bookshelf) {
        this.bookshelves.add(bookshelf);
    }
}
