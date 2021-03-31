import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class movie {

    public static void main(String[] args) {

        MovieDetailsList m = new MovieDetailsList();

        m.addMovie("a","comedy");
        m.addMovie("b","action");
        m.addMovie("c","horror");
       m.findMovieByName("d");
	
      // m.findMovieByName("c");
	 m.findMovieByGenre("action");
	//m.removeMovie("a");
      //  m.removeAllmovies();

      
    }
}
 class MovieDetails {

    private String movieName;
    private String leadActor;
    private String leadActress;
    private String genre;

    public MovieDetails(String movieName, String genre) {
        this.movieName = movieName;
        
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie_Details{" +
                "movieName='" + movieName + '\'' +
                ",  genre='" + genre + '\'' +
                '}';
    }
}



 class MovieDetailsList {

    ArrayList<MovieDetails> movies = new ArrayList<>();


    public void addMovie(String name, String genre){
        movies.add(new MovieDetails(name,genre));
    }

   public void removeMovie(String movie){

        for (MovieDetails m:movies) {
            if(m.getMovieName().equalsIgnoreCase(movie)){
               
            }
            System.out.println("  movie removed");
        }
    }

    public void removeAllMovies(){
        movies.removeAll(movies);
    }

    public void findMovieByName(String name){

        for (MovieDetails m: movies) {
            if(m.getMovieName().equalsIgnoreCase(name)){
               
                System.out.println(m.toString());

            }
else
                System.out.println(m+"Movie not in the LIST");
break;
           
        }

    }

    public void findMovieByGenre(String genre){
        for (MovieDetails m: movies) {
            if(m.getGenre().equalsIgnoreCase(genre)){
                System.out.println(m.toString());
            }
        }
    }

    

    @Override
    public String toString() {
        return "MovieDetailsList{" +
                "movies=" + movies +
                '}';
    }
}



