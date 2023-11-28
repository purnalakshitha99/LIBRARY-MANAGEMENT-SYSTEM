package lk.purna.librarymanagementsystem.controller;

import lk.purna.librarymanagementsystem.controller.request.CreateAuthorRequest;
import lk.purna.librarymanagementsystem.controller.response.AuthorResponse;
import lk.purna.librarymanagementsystem.controller.response.BooksAuthorResponse;
import lk.purna.librarymanagementsystem.service.AuthorService;
import lk.purna.librarymanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/authors")
    public void add(){
        authorService.add();

    }

    @DeleteMapping("/authors/{author-id}")
    public void delete(){
        authorService.delete();
    }

    @GetMapping("/authors")
    public AuthorResponse get(@RequestBody CreateAuthorRequest createAuthorRequest){
        authorService.get();

        AuthorResponse authorResponse = new AuthorResponse();

        authorResponse.setId(createAuthorRequest.getId());
        authorResponse.setName(createAuthorRequest.getName());

        return  authorResponse;

    }

    @GetMapping("/authors/{author-id}")
    public AuthorResponse getSpecific(@RequestBody CreateAuthorRequest createAuthorRequest){
        String message = authorService.getSpecific(createAuthorRequest.getId(),createAuthorRequest.getName());

        AuthorResponse authorResponse = new AuthorResponse();

        authorResponse.setMessage(message);
        authorResponse.setId("2333");
        authorResponse.setName("purna");

        return authorResponse;
    }
}
