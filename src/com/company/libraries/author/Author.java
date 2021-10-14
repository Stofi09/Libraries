package com.company.libraries.author;

import com.company.libraries.books.aBook;

import java.util.ArrayList;

public class Author extends aAuthor{

    private final String name;
    private ArrayList<aBook> books;

    public Author(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setBooks(aBook book){
        if(books == null){
            books = new ArrayList<>();
        }
        books.add(book);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

}
