package lk.purna.librarymanagementsystem.controller;

import lk.purna.librarymanagementsystem.controller.request.CreateBookRequest;
import lk.purna.librarymanagementsystem.controller.response.BookResponse;
import lk.purna.librarymanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public void add(){
        bookService.add();

    }

    @DeleteMapping("/books/{book-id}")
    public void delete(){
        bookService.delete();
    }

    @GetMapping("/books")
    public BookResponse get(@RequestBody CreateBookRequest createBookRequest){
        bookService.get();

        BookResponse bookResponse = new BookResponse();

        bookResponse.setName(createBookRequest.getName());
        bookResponse.setId(createBookRequest.getId());

        return  bookResponse;

    }




}
