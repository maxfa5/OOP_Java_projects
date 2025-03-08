package OOP.films;



public  class Horror extends FilmCatalogue.Movie {
    public Horror(String title, String director) {
            super(title, director);
        }
    
        @Override
    public void play() {
        System.out.printf("Смотрим %s \"%s\" реж. %s", "Horror", title_,director_);
    }
    
}
