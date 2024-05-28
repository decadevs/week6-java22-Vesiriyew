package school_library_task5;

import school_library_task5.enums.Gender;
import school_library_task5.enums.Role;
import school_library_task5.models.Book;
import school_library_task5.models.Person;
import services.implementation.LibraryServiceImpl;

public class Main{
    public static void main(String[] args) {

        //Creating instances of the Person Class
        Person juniorStudent = new Person("Mariam Bajah", 16, "J25", Gender.FEMALE, Role.JUNIOR_STUDENT);
        Person seniorStudent = new Person("John Paul", 18, "J25", Gender.MALE, Role.SENIOR_STUDENT);
        Person teacher = new Person("Ngozi Unegbu", 42, "T23", Gender.FEMALE, Role.TEACHER);
        Person librarian = new Person("Ngo Unegbu", 42, "T23", Gender.FEMALE, Role.LIBRARIAN);

        //Creating instances of the book class
        Book book = new Book("Joys of Motherhood ", 2 , true);
        Book book1 = new Book("Half a Yellow Sun ", 2, true);

        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        //This Is To Add To The Queue
        libraryService.addToQueue(juniorStudent);
        libraryService.addToQueue(seniorStudent);
        libraryService.addToQueue(teacher);


        //This is without Priority
        libraryService.addToQueueOnFirstCome(juniorStudent);
        libraryService.addToQueueOnFirstCome(seniorStudent);
        libraryService.addToQueueOnFirstCome(teacher);

        System.out.println("This is the Request ");
        System.out.println(libraryService.requestBook(juniorStudent, book, "Junior Student"));

        System.out.println("**************************************************");

        System.out.println("THIS IS WITH PRIORITY");
        System.out.println(libraryService.borrowBook(book, librarian));
        System.out.println(libraryService.borrowBook(book, librarian));
        System.out.println(libraryService.borrowBook(book, librarian));
        System.out.println("******************************************");

        System.out.println("THIS IS WITHOUT PRIORITY");
        System.out.println(libraryService.getBookOnFirstCome(book1, librarian));
        System.out.println(libraryService.getBookOnFirstCome(book1, librarian));
        System.out.println(libraryService.getBookOnFirstCome(book1,librarian));
        System.out.println("*****************************************************");




    }
    }

