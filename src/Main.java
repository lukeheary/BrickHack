
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    Scanner in;

    public void main(String[] args) {

        this.in = new Scanner(System.in);
        System.out.print("Welcome to your movie library. What would you like to do?\n");
        System.out.print("Options: 'Search', 'Add Movie', 'Edit Movie'");
        String inputOption = in.next();
        boolean valid = false;

        inputOption.toLowerCase();
        while(!valid) {
            if (inputOption.equals("add movie")) {
                valid = true;
                addMovie();
            } else if (inputOption.equals("search")) {
                valid = true;
                searchForMovie();
            } else if (inputOption.equals("edit movie")) {
                valid = true;
                editMovie();
            } else {
                System.out.print("Please enter a valid option.");
            }
        }
    }

    public void addMovie() {
        // get the title of the movie
        System.out.print("What movie do you want to add? ");
        String title = this.in.next();

        // get the genre of the movie
        System.out.println("Ok, now enter the genre: ");
        String genre = this.in.next();

        // checks if they've seen the movie
        System.out.println("Great, have you seen this movie?");
        String watchedAnswer = this.in.next().toLowerCase();
        boolean haveWatched = false;
        int rating;

        // if they've seen the movie, get the rating, else -1
        if (watchedAnswer.startsWith("y")) {
            haveWatched = true;

            System.out.println("Alright, now what do you want to rate it out of 10?");
            rating = this.in.nextInt();
        } else {
            rating = -1;
        }

        System.out.println("Adding movie...");
        Movie node = new Movie(title, genre, haveWatched, rating);

    }

    public void searchForMovie() {
        System.out.println("What movie are you looking for? ");



    }

    public void editMovie() {
        System.out.println("What movie do you want to edit? ");



    }
}