package com.company.libraries.item;

import com.company.libraries.creator.Author;

import java.util.ArrayList;

public class EBook extends aBook{

    private String link;

    public EBook(long ISBN, String title, Author author, Enum type, String link) {
        super(ISBN, title, author, type);
        this.link = link;
    }

    public EBook(long ISBN, String title, ArrayList<Author> authors, Enum type, String link) {
        super(ISBN, title, authors, type);
        this.link = link;
    }

    public String getLink() {
        return link;
    }
}
