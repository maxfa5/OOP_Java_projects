package OOP.Books;

import java.util.Objects;

public class  Book {
    public static void main(String[] args){
        Book book1 = new  Book("А", 2000, "Б");
        System.out.println(book1.toString());


        Book book2 = new  Book("А2", 2000, "Б2");
        
        Book book3 = new  Book("А2", 2001, "Б2");
        System.out.printf("Тест equals: \n1)%s\n2)%s\n", book1.equals(book2), book3.equals(book2));
        System.out.printf("Тест hashCode: \n1)%s\n2)%s\n3)%s\n" + //
                        "", book1.hashCode(), book2.hashCode(), book3.hashCode());

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
        return  title_ +", автор: [" + author_ +
                "], год написания: [" + year_ + ']';
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