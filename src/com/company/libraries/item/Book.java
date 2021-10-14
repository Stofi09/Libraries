package com.company.libraries.item;

import com.company.libraries.creator.Author;

import java.util.ArrayList;

public class Book extends aBook{


    public Book(long ISBN, String title, Author author, Enum type) {
        super(ISBN, title, author, type);
    }

    public Book(long ISBN, String title, ArrayList<Author> authors, Enum type) {
        super(ISBN, title, authors, type);
    }
}
