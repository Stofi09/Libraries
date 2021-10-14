package com.company.libraries.creator;

import com.company.libraries.item.aBook;

import java.util.ArrayList;
import java.util.List;

public class Author extends aCreator {

    private  String name;
    private List<aBook> books;

    public Author(String name) {
        super(name);
    }

    public String getName(){
        return this.name;
    }

    public void addBook(aBook book){
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
