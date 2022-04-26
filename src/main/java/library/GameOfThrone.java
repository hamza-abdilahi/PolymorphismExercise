package library;

public class GameOfThrone extends Bookshelf {
    private boolean available;

    public GameOfThrone(String title, String genre, String author, int date, boolean available) {
        super(title, genre, author, date);

        this.available = available;
    }

    public boolean available(){
        return available;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }


}
