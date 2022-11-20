package libraryAutomation.business;

import libraryAutomation.core.logging.Logger;
import libraryAutomation.dataAccess.BooksDao;
import libraryAutomation.entities.Books;

import java.util.List;

public class BooksManager {
    private BooksDao booksDao;
    private List<Logger> loggers;

    public BooksManager(BooksDao booksDao, List<Logger> loggers ) {
        this.booksDao = booksDao;
        this.loggers = loggers;
    }


    //Business Rules

    public void add(Books book) throws Exception {
        if (book.getBookStock()<1){
            throw new Exception("It is not possible to add less than 1 to the book stock.");

        }
        booksDao.add(book);

        for (Logger logger: loggers) {
            logger.log(book.getBookName());

        }
    }




}
