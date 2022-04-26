package Genre;

import library.Bookshelf;

public class Novella extends Genre{
    public Novella(String title, String author) {
        super(title, author);
    }

    public void addBookshelf(Bookshelf bookshelf) {
        this.bookshelves.add(bookshelf);
    }
}
