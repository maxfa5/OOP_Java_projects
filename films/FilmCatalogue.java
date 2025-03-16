package OOP.films;

class FilmCatalogue <T extends Movie>{
    public static void main(String[] args){
        FilmCatalogue<Movie> films = new FilmCatalogue<>(10);
        Horror h = new Horror("null", "null");
        Action a = new Action("a", "a");
        Comedy c = new Comedy("C", "c");

        films.addMovie(h);
        films.addMovie(c);
        films.addMovie(a);
        
        films.playMovieByTitle("null");
        films.playMovieByTitle("a");
        films.playMovieByTitle("c");
    }
    
    public Movie[] movies_;
    private int cap_;
    private int size_= 0;
    FilmCatalogue(int capacity) {
        movies_ = new Movie[capacity];
        cap_ = capacity;
    }
    
    public void addMovie(T newMovie){
        if (cap_ == size_) {
            System.out.printf("Catalog dont have size!");
            return;
        }
        movies_[size_++] = (Movie) newMovie;
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
        try {
            Movie movie = searchMovieByTitle(title);
            movie.play();
            
        } catch (Exception e) {
                    }
    }

    
    
}   

abstract class Movie {
    public Movie(String title, String director) {
        this.title_ = title;
        this.director_ = director;
    }

    protected String director_;
    protected String title_;
    public abstract void play();
}

class Horror extends Movie {
    public Horror(String title, String director) {
            super(title, director);
        }
    
        @Override
    public void play() {
        System.out.printf("Смотрим %s \"%s\" реж. %s\n", "Horror", title_,director_);
    }
    
}
class Action extends Movie{
    public Action(String title, String director) {
            super(title, director);
        }
    
        @Override
    public void play() {
        System.out.printf("Смотрим %s \"%s\" реж. %s\n", "Action", title_,director_);
    }
    
}

class Comedy extends Movie{
    public Comedy(String title, String director) {
            super(title, director);
        }
    
        @Override
    public void play() {
        System.out.printf("Смотрим %s \"%s\" реж. %s\n", "Comedy", title_,director_);
    }
    
}