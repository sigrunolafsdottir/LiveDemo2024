package com.example.demo.BooksDemo;

import java.util.ArrayList;
import java.util.List;


public class BookDAO {

    List<Book> bookList = new ArrayList();

    public BookDAO(){
        Book b1 = new Book(1, "Dawn", "Octavia Butler");
        Book b2 = new Book(2, "Parable of the Sower", "Octavia Butler");
        bookList.add(b1);
        bookList.add(b2);
    }

    public List<Book> getBookList(){
        return bookList;
    }
}
