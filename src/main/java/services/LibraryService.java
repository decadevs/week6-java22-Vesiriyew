package services;

import school_library_task5.models.Book;
import school_library_task5.models.Person;

public interface LibraryService {

    public void addToQueue(Person person);

    public String requestBook(Person person, Book book, String borrower);

    public String borrowBook(Book book, Person librarian);

    void addToQueueOnFirstCome(Person person);

    String getBookOnFirstCome(Book bookTitle, Person librarian);
}
