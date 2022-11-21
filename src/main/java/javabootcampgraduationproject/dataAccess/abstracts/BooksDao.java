package main.java.javabootcampgraduationproject.dataAccess.abstracts;

import main.java.javabootcampgraduationproject.entities.Books;

import java.util.List;

public interface BooksDao {
    List<Books> getAll();
}
