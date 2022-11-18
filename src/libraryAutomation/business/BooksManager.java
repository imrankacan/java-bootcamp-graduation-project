package libraryAutomation.business;

import libraryAutomation.dataAccess.JdbsBooksDao;
import libraryAutomation.entities.Books;

public class BooksManager {
    //Business Rules
    public void add(Books book) throws Exception {
        if (book.getBookStock()<1){
            throw new Exception("It is not possible to add less than 1 to the book stock.");

        }
        JdbsBooksDao booksDao = new JdbsBooksDao();
        booksDao.add(book);
    }
}
