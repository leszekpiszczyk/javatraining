package models;

public class Movie {

//        składniki klasy
    private String title;   //text "To jest szkolenie"
    private int rating; //liczby całkowite -2 mld + 2 mld
    private long liczbaLudnosci;
    private char category;  //jeden znak 'A', 'B', '5'
    private double budget;  //zmiennoprzecinkowe liczby 55.5
    private boolean isMovieProzed;  //true, false

    public Movie(String title) {
        this.title = title;
    }
    public Movie(String title, int rating, char category, double budget, boolean isMovieProzed) {
        this.title = title;
        this.rating = rating;
        this.category = category;
        this.budget = budget;
        this.isMovieProzed = isMovieProzed;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean isMovieProzed() {
        return isMovieProzed;
    }

    public void setMovieProzed(boolean movieProzed) {
        isMovieProzed = movieProzed;
    }
}
