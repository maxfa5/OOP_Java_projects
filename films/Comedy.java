package OOP.films;


public class Comedy extends FilmCatalogue.Movie{
    public Comedy(String title, String director) {
            super(title, director);
        }
    
        @Override
    public void play() {
        System.out.printf("Смотрим %s \"%s\" реж. %s", "Comedy", title_,director_);
    }
    
}
