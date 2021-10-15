package com.company.libraries.item;

import com.company.libraries.creator.Author;

import java.util.ArrayList;
import java.util.List;

public class EBook extends aBook{

    private String link;

    public EBook(long ISBN, String title, Author author, Enum type, String link) {
        super(ISBN, title, author, type);
        this.link = link;
    }


    public String getLink() {
        return link;
    }
}
