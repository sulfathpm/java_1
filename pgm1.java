class Book {
    String author,title;
    static int BookCount = 0;   // added data type

    Book(String author) {       // corrected String
        this.author = author;
        this.title=title;
        BookCount = BookCount + 1;
    }

    static void showCount() { 
        System.out.println("Total books: " + BookCount);
    }
    public boolean isSameBook(Book other) {
        if (other == null) {
            return false;
        }
        return this.author.equals(other.author) &&
               this.title.equals(other.title);
    }
}

public class pgm1 {
    public static void main(String[] args) {
        Book b1 = new Book("a");
        Book b2 = new Book("b");

        Book.showCount();   // proper way to call static method
            System.out.println(b1.isSameBook(b2));

    }
}