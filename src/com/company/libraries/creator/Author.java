package com.company.libraries.creator;

import com.company.libraries.item.aBook;

import java.util.ArrayList;
import java.util.List;

public class Author extends aCreator {

    private  String name;
    private List<aBook> books;

    public Author(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addBook(aBook book){
        books.add(book);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ",and has books=" + books.size() +
                '}';
    }
}
