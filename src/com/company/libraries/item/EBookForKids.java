package com.company.libraries.item;

import com.company.libraries.creator.Author;

import java.util.ArrayList;

public class EBookForKids extends EBook implements AgeAppropriate{


    public EBookForKids(long ISBN, String title, Author author, Enum type, String link) {
        super(ISBN, title, author, type, link);
    }

    public EBookForKids(long ISBN, String title, ArrayList<Author> authors, Enum type, String link) {
        super(ISBN, title, authors, type, link);
    }
}
