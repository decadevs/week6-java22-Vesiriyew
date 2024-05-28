package school_library_task5.models;

import java.util.*;

public class Library {
    //THIS IS TO TAKE THE LIST OF BOOKS
    private List<Book> books = new ArrayList<>();
    
    public static PriorityQueue<Person> personPriorityQueue=new PriorityQueue<>(new ComparatorPerson());
    public static Queue<Person> personQueue=new LinkedList<>();



    public Library(List<Book> books) {
        this.books=books;

    }

    
}
