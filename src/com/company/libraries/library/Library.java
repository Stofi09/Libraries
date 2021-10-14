package com.company.libraries.library;

import com.company.libraries.book.aBook;

import java.util.ArrayList;

public class Library extends aLibrary {

    private String address;
    private String name;
    private ArrayList<aBook> books;

    public Library(String name){
        this.name = name;
    }
    public Library(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }


    private void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getName() {
        return name;
    }


    private void setName(String name) {
        this.name = name;
    }

    public ArrayList<aBook> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<aBook> books) {
        this.books = books;
    }
    public void setBooks(aBook book) {
      this.books.add(book);
    }
}
