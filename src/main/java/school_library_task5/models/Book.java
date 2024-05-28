package school_library_task5.models;

public class Book {
    private String BookTitle;
    private int currentNoOfCopies;
    private boolean isAvailable;
    
    //CONSTRUCTOR
    public Book(String bookTitle, int currentNoOfCopies, boolean isAvailable) {
        this.BookTitle = bookTitle;
        this.currentNoOfCopies = currentNoOfCopies;
        this.isAvailable = isAvailable;
    }


    //GETTERS
    public String getBookTitle() {
        return BookTitle;
    }

    public int getCurrentNoOfCopies() {
        return currentNoOfCopies;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    //SETTERS
    public void setCurrentNoOfCopies(int currentNoOfCopies) {
        this.currentNoOfCopies = currentNoOfCopies;
    }
    


    //TO STRING
    @Override
    public String toString() {
        return "Book{" +
                "BookTitle='" + BookTitle + '\'' +
                ", currentNoOfCopies=" + currentNoOfCopies +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
