package lk.purna.librarymanagementsystem.service;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    public void add(){
        System.out.println("add authors");
    }

    public void delete(){
        System.out.println("delete specific authors");
    }

    public void get(){
        System.out.println("get authors");
    }

    public String getSpecific(String id,String name){
        System.out.println("get specific author");
        String message = "Author id :- "+id+" Author name is :- "+name;

        return message;
    }
}
