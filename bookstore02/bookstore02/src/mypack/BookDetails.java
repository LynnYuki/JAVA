package mypack;

import java.io.Serializable;

public class BookDetails implements Comparable<BookDetails> , Serializable{
    private String bookId = null;
    private String title = null;
    private double price = 0.0;

    public BookDetails(String bookId, String title,double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public double getPrice() {
       return price;
    }

    public String getBookId() {
        return this.bookId;
    }

    public int compareTo(BookDetails o) {
         BookDetails n = (BookDetails)o;
         int lastCmp = title.compareTo(n.title);
            return (lastCmp);
    }
}




