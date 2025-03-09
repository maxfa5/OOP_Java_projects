package OOP.Books;

import java.util.Objects;

public class  Book {
    public static void main(String[] args){
         Book book1 = new  Book("А", 2000, "Б");

    }

    private String title_;
    private String author_;
    private int year_;
    public  Book(String title,int year, String author) {
        title_ = title;
        author_ = author;
        year_ =year; 
    }

    @Override
    public String toString() {
        return  title_ +", автор: [" + author_ + '\'' +
                "],  год написания: [" + year_ + ']';
    }
    @Override
    public boolean equals(Object other){
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;

            Book otherBook = (Book) other;

        return this.year_ ==  otherBook.year_;
    }
    

    @Override
    public int hashCode() {
        return Objects.hash(year_);
}

}   