package com.example.demo.BooksDemo;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private final BookDAO bd = new BookDAO();
    private List<Book> allBooks;


    public BookController(){
        allBooks = bd.getBookList();
    }


    @RequestMapping("/books")
    public List<Book> getBooks(){
        return allBooks;
    }

    @RequestMapping("/books/{id}")
    public List<Book> getBooksById(@PathVariable Integer id){
        return allBooks.stream().filter(b -> b.getId()==id).toList();
    }

    @RequestMapping("/books/{id}/delete")
    public List<Book> deleteBooksById(@PathVariable Integer id){
        allBooks = allBooks.stream().filter(b -> b.getId() != id).toList();
        return allBooks;
    }

    @PostMapping("/books/add")
    public List<Book> addBook(@RequestBody Book b){
        allBooks.add(b);
        return allBooks;
    }




}
