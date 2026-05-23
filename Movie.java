public class Movie {
    String name;
    String language;
    int rating;
    Movie(String name, String language, int rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;
    }
    void displayMovieDetails() {
        System.out.println("Movie Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Rating (out of 5): " + rating);
    }
    public static void main(String[] args) {
        Movie m1 = new Movie("Avatar", "English", 5);
        Movie m2 = new Movie("Kabaddi", "Nepali", 4);
        Movie m3 = new Movie("3 Idiots", "Hindi", 5);
        Movie m4 = new Movie("Spider-Man", "English", 4);
        m1.displayMovieDetails();
        m2.displayMovieDetails();
        m3.displayMovieDetails();
        m4.displayMovieDetails();
    }
}