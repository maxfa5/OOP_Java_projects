package OOP.films;

public class Action extends FilmCatalogue.Movie{
    public Action(String title, String director) {
            super(title, director);
        }
    
        @Override
    public void play() {
        System.out.printf("Смотрим %s \"%s\" реж. %s", "Action", title_,director_);
    }
    
}