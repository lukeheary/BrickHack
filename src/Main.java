import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to your movie library. What would you like to do?\n");

        while (true) {
            System.out.print("(Options: 'Search', 'Add Movie', 'Edit Movie', 'Exit')\n");
            String inputOption = in.nextLine();
            boolean valid = false;

            inputOption.toLowerCase();
            if (inputOption.equals("add movie")) {
                valid = true;
                addMovie();
            } else if (inputOption.equals("search")) {
                valid = true;
                searchForMovie();
            } else if (inputOption.equals("edit movie")) {
                valid = true;
                editMovie();
            } else if ( inputOption.equals("exit")) {
                break;
            } else {
                System.out.print("Please enter a valid option.");
            }

        }
    }

    public static void addMovie() {
        Scanner in = new Scanner(System.in);
        // get the title of the movie
        System.out.print("What movie do you want to add? \n");
        String title = in.next();

        // get the genre of the movie
        System.out.println("Ok, now enter the genre: ");
        String genre = in.next();

        // checks if they've seen the movie
        System.out.println("Great, have you seen this movie?");
        String watchedAnswer = in.next().toLowerCase();
        String haveWatched = "y";
        String rating;

        // if they've seen the movie, get the rating, else -1
        if (watchedAnswer.startsWith("y")) {

            System.out.println("Alright, now what do you want to rate it out of 10?");
            rating = in.next();
        } else {
            haveWatched = "n";
            rating = "-1";
        }

        System.out.println("Adding movie...");
        String[] information = new String[4];

        information[0] = title;
        information[1] = genre;
        information[2] = haveWatched;
        information[3] = rating;

        Movie movie = new Movie(information);

        System.out.println("Movie added: " + movie.toString() + "\n");
        System.out.println("What do you want to do next?");
    }

    public static void searchForMovie() {
        Scanner in = new Scanner(System.in);
        System.out.println("What movie are you looking for? ");
        String input = in.next();



    }

    public static void editMovie() {
        Scanner in = new Scanner(System.in);
        System.out.println("What movie do you want to edit? \n");
        String movie = in.next();

        System.out.println("What part of the movie do you want to edit?\n");
        System.out.print("(Options: 'Title', 'Genre', 'Have you seen this movie?', 'Rating')\n");
        String option = in.nextLine();


    }
}