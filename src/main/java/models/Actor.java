package models;

public class Actor {

//    konstruktor - mechanizm do tworzenia obiektów


    private String firstName;
    private String lastName;
    private int rating;
    private boolean isOscarPriset;

    public Actor(String firstName, String lastName, int rating, boolean isOscarPriset) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.isOscarPriset = isOscarPriset;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isOscarPriset() {
        return isOscarPriset;
    }

    public void setOscarPriset(boolean oscarPriset) {
        isOscarPriset = oscarPriset;
    }
}

