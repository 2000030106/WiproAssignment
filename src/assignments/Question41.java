package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BookStore {
    private int bookId;
    private String bookName;

    public BookStore(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "BookStore [BookID=" + bookId + ", BookName=" + bookName + "]";
    }
}

class BookNameComparator implements Comparator<BookStore> {
    @Override
    public int compare(BookStore b1, BookStore b2) {
        return b1.getBookName().compareToIgnoreCase(b2.getBookName());
    }
}

class BookIdComparator implements Comparator<BookStore> {
    @Override
    public int compare(BookStore b1, BookStore b2) {
        return Integer.compare(b1.getBookId(), b2.getBookId());
    }
}


public class Question41 
{
	public static void main(String[] args) {
        List<BookStore> books = new ArrayList<>();

        books.add(new BookStore(311, "SQL"));
        books.add(new BookStore(312, "Java Programming"));
        books.add(new BookStore(319, "Python"));
        books.add(new BookStore(315, "Html"));

        // Sort by Book Name
        Collections.sort(books, new BookNameComparator());
        System.out.println("Books sorted by Book Name:");
        for (BookStore book : books) {
            System.out.println(book);
        }

        System.out.println("\nBooks sorted by Book ID:");
        // Sort by Book ID
        Collections.sort(books, new BookIdComparator());
        for (BookStore book : books) {
            System.out.println(book);
        }
    }

}


/*
Books sorted by Book Name:
BookStore [BookID=315, BookName=Html]
BookStore [BookID=312, BookName=Java Programming]
BookStore [BookID=319, BookName=Python]
BookStore [BookID=311, BookName=SQL]

Books sorted by Book ID:
BookStore [BookID=311, BookName=SQL]
BookStore [BookID=312, BookName=Java Programming]
BookStore [BookID=315, BookName=Html]
BookStore [BookID=319, BookName=Python]
*/