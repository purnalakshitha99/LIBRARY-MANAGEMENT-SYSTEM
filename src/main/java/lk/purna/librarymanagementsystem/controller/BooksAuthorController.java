package lk.purna.librarymanagementsystem.controller;

import lk.purna.librarymanagementsystem.controller.request.CreateBooksAuthorRequest;
import lk.purna.librarymanagementsystem.controller.response.BooksAuthorResponse;
import lk.purna.librarymanagementsystem.service.BooksAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksAuthorController {

    @Autowired
    private BooksAuthorService booksAuthorService;

    @GetMapping("/books/{author-id}")
    public BooksAuthorResponse get(@RequestBody CreateBooksAuthorRequest createBooksAuthorRequest){
        booksAuthorService.get();

        BooksAuthorResponse booksAuthorResponse = new BooksAuthorResponse();

        booksAuthorResponse.setId(createBooksAuthorRequest.getId());
        booksAuthorResponse.setName(createBooksAuthorRequest.getName());

        return booksAuthorResponse;

    }
}
