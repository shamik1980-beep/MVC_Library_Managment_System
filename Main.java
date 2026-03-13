package com.lab.mvc;

import com.lab.mvc.controller.BookController;
import com.lab.mvc.model.BookRepository;
import com.lab.mvc.view.BookView;

// This is the entry point of the application 

public class Main {
    public static void main(String[] args) {
        BookRepository repo = new BookRepository();
        BookView view = new BookView();
        new BookController(repo, view).start();
    }
}


