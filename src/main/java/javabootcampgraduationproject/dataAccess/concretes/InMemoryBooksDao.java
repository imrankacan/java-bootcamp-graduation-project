package main.java.javabootcampgraduationproject.dataAccess.concretes;

import main.java.javabootcampgraduationproject.dataAccess.abstracts.BooksDao;
import main.java.javabootcampgraduationproject.entities.Books;

import java.util.ArrayList;
import java.util.List;


public class InMemoryBooksDao implements BooksDao {

    ArrayList<Books> books;

    public InMemoryBooksDao() {
        books = new ArrayList<Books>();
        books.add(new Books());

    }

    @Override
    public List<Books> getAll() {
        return books;
    }
}
