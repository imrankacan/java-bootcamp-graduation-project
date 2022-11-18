package libraryAutomation.business;

import libraryAutomation.dataAccess.BooksDao;
import libraryAutomation.dataAccess.JdbsBooksDao;
import libraryAutomation.entities.Books;

public class BooksManager {
    private BooksDao booksDao;

    public BooksManager(BooksDao booksDao) {
        this.booksDao = booksDao;
    }

    //Business Rules
    public void add(Books book) throws Exception {
        if (book.getBookStock()<1){
            throw new Exception("It is not possible to add less than 1 to the book stock.");

        }
        booksDao.add(book);
    }
}
