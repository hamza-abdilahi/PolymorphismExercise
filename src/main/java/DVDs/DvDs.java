package DVDs;

public abstract class DvDs {

    protected String title;
    private String genre;
    private String director;
    private int date;


    public DvDs(String title, String genre, String director, int date){
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.date = date;
    }

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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String loanA(){
        return "You have loaned " + (this.title);
    }
}


