package lms;

import java.util.ArrayList;
import java.util.List;

public class LMS {

    List<Book> books = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<BorrowedBook> borrowedBooks = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    public boolean borrowBook(Book book, Student student) {
        boolean borrowed = false;
        if (books.contains(book)) {
            borrowedBooks.add(new BorrowedBook(book, student));
            borrowed = true;
        }
        return borrowed;
    }

    public boolean returnBook(Book book) {
        boolean returned = false;
        for (BorrowedBook borrowedBook : borrowedBooks) {
            if (borrowedBook.getBook().equals(book)) {
                borrowedBooks.remove(borrowedBook);
                returned = true;
                break;
            }
        }
        return returned;
    }

    public void saveState(String filePath) {
        // TODO must be implemented
    }

    public void loadState(String filePath) {
        // TODO must be implemented
    }
}
