package assignments;

import java.util.ArrayList;

class Book {
    String title;
    public Book(String title) {
        this.title = title;
    }
    public String toString() {
        return "Book: " + title;
    }
}

class Video {
    String title;
    public Video(String title) {
        this.title = title;
    }
    public String toString() {
        return "Video: " + title;
    }
}

class Newspaper {
    String name;
    public Newspaper(String name) {
        this.name = name;
    }
    public String toString() {
        return "Newspaper: " + name;
    }
}

class GenericLibrary<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public T retrieve(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }
}



class NonGenericLibrary {
    private ArrayList<Object> items = new ArrayList<>();

    public void add(Object item) {
        items.add(item);
    }

    public Object retrieve(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }
}



public class Question39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericLibrary<Book> bookLibrary = new GenericLibrary<>();
        bookLibrary.add(new Book("Java Programming"));
        System.out.println("Generic: " + bookLibrary.retrieve(0));

        GenericLibrary<Video> videoLibrary = new GenericLibrary<>();
        videoLibrary.add(new Video("Learning Java in 30 minutes"));
        System.out.println("Generic: " + videoLibrary.retrieve(0));

        GenericLibrary<Newspaper> newspaperLibrary = new GenericLibrary<>();
        newspaperLibrary.add(new Newspaper("The Hindu"));
        System.out.println("Generic: " + newspaperLibrary.retrieve(0));

        System.out.println();

        NonGenericLibrary nonGenericLibrary = new NonGenericLibrary();
        nonGenericLibrary.add(new Book("C++ Primer"));
        nonGenericLibrary.add(new Video("Python Tutorial"));
        nonGenericLibrary.add(new Newspaper("Times of India"));

        System.out.println("Non-Generic: " + nonGenericLibrary.retrieve(0));
        System.out.println("Non-Generic: " + nonGenericLibrary.retrieve(1));
        System.out.println("Non-Generic: " + nonGenericLibrary.retrieve(2));
    

	}

}

/*
 * output:
 * Generic: Book: Java Programming
Generic: Video: Learning Java in 30 minutes
Generic: Newspaper: The Hindu

Non-Generic: Book: C++ Primer
Non-Generic: Video: Python Tutorial
Non-Generic: Newspaper: Times of India
*/
