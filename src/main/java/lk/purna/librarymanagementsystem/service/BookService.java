package lk.purna.librarymanagementsystem.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public void add(){
        System.out.println("add books");
    }

    public void delete(){
        System.out.println("delete specific books");
    }

    public void get(){
        System.out.println("get books");
    }
}
