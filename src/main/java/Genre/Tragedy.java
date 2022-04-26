package Genre;

import library.Bookshelf;

public class Tragedy extends Genre {

    public Tragedy(String title, String author) {
        super(title, author);
    }

    public void addBookshelf(Bookshelf bookshelf) {
        this.bookshelves.add(bookshelf);
    }

}
