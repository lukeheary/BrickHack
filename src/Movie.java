/**
 * @author Lucas Kessler lxk6020@rit.edu
 *         Created:     2/11/2017
 *         File:        Movie.java
 *         Description:
 */



public class Movie {
    /*
     * Title of the movie
     */
    private String title;

    /*
     * Genre of the movie
     */
    private String genre;

    /*
     * haveyou seen this movie
     */
    private boolean haveSeen;

    /*
     * rating of the movie
     */
    private int rating;


    //TODO
    /*
     * iMDb rating
     * private int iMDb
     */

    /*
     * Cast members

     * private List<Movie> actors;
     */

    /*
     * Description
     *
     * private String description;
     */

    public Movie(String[] information){
        this.title = information[0];
        this.genre = information[1];
        if(Integer.parseInt(information[2]) == 1) {
            this.haveSeen = true;
            this.rating = Integer.parseInt(information[3]);
        }
    }

    public String toString() {
        String result;
        result = title + ", ";
        result += genre + ", ";
        if(haveSeen) {
            result += "yes, " + rating + "/10\n";
        }
        return result;

    }
}
