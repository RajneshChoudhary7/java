package practice;
class book{
    String title;
    String Author;
    String isbn;
    int static totalBooks;

    boolean isBorrowed;
    static {
        totalBooks=0;
    }
    {
        totalBooks++;
    }
    book(String isbn,String title, String Author)
    {
        this.isbn=isbn;
        this.title=title;
        this.Author=Author;
    }

    book(String isbn){
        this(isbn, "unknown","unknown");
    }

    static int gettotalbooks(){
        return totalBooks;
    }
}
public class bookclass {
    
}
