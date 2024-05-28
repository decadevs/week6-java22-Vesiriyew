package services.implementation;

import school_library_task5.models.Book;
import school_library_task5.models.Person;
import services.LibraryService;

import static school_library_task5.models.Library.personPriorityQueue;
import static school_library_task5.models.Library.personQueue;

public class LibraryServiceImpl implements LibraryService {



    //To add to the queue
    @Override
    public void addToQueue(Person person) {
        personPriorityQueue.add(person);

    }
//To request for a book
    @Override
    public String requestBook(Person person, Book book, String borrower) {
       if (book.isAvailable()){
        return "Book is not Available";
    }
    personPriorityQueue.add(person);
     return person.getFullName() + "Has requested for " + book.getBookTitle();

     //To borrow a book

    }
    @Override
    public String borrowBook(Book book, Person librarian) {
        if (personPriorityQueue.isEmpty()) {
            return "No one is on the Queue";

        } else if (book.getCurrentNoOfCopies() == 0) {
            return "Books Taken";
        }
        Person person = personPriorityQueue.poll();

        book.setCurrentNoOfCopies(book.getCurrentNoOfCopies() - 1); //To decrease the number of copies
        assert person != null;
        return person.getFullName() + "Has borrowed " + book.getBookTitle() + "And it was issued by" + librarian.getFullName();
    }


        @Override
        public void addToQueueOnFirstCome(Person person){
            personQueue.add(person);

        }

        @Override
        public String getBookOnFirstCome(Book bookTitle, Person librarian) {
            if (personQueue.isEmpty()) {
                return "No one is on the queue";

            } else if (bookTitle.getCurrentNoOfCopies() == 0) {
                return "Book Taken";

            }

            Person persons = personQueue.poll();
            bookTitle.setCurrentNoOfCopies(bookTitle.getCurrentNoOfCopies() - 1);//Decrease the book copy count

            assert persons != null;
            return persons.getFullName() + "has borrowed" + bookTitle.getBookTitle() + "And it was issued by " + librarian.getFullName();


        }
    }
