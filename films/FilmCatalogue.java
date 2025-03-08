package OOP.films;

public class FilmCatalogue {
    public static void main(String[] args){
        FilmCatalogue films = new FilmCatalogue(10);
        films.addMovie(0,"great film", "Author");
        films.playMovieByTitle("great film");
    }

    private int cap_;
    private int size_= 0;
    public FilmCatalogue(int capacity) {
        movies_ = new Movie[capacity];
        cap_ = capacity;
    }
    public void addMovie(int genre, String title, String  director){
        if (cap_ == size_) {
            System.out.printf("Catalog dont have size!");
            return;
        }
        Movie newMovie = null;
        if (genre ==0) {
            newMovie = new Horror(title,director); 
        } else if (genre ==1) {
            newMovie = new Action(title,director); 
        }else if (genre == 2) {
            newMovie = new Comedy(title,director); 
        }
        movies_[size_++] = newMovie;
    }
    private  Movie searchMovieByTitle(String title){
        Movie result = null;
        if (movies_!=null){
            for (Movie movie : movies_) {
                if (movie != null &&movie.title_.equalsIgnoreCase(title)){
                    result = movie;
                }
            }
        }
        return result;
    }
    public void playMovieByTitle(String title){
        Movie movie = searchMovieByTitle(title);
        movie.play();
    }

    public static Movie[] movies_;
    public static abstract class Movie {
        public Movie(String title, String director) {
            this.title_ = title;
            this.director_ = director;
        }

        protected String director_;
        protected String title_;
        public abstract void play();
    }

    public static class Horror extends FilmCatalogue.Movie {
        public Horror(String title, String director) {
                super(title, director);
            }
        
            @Override
        public void play() {
            System.out.printf("Смотрим %s \"%s\" реж. %s", "Horror", title_,director_);
        }
        
    }
}   