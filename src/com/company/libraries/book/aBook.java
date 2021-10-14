package com.company.libraries.book;

import com.company.libraries.author.Author;

import java.util.ArrayList;

public abstract class aBook {

    private int ISBN;
    private String title;
    private ArrayList<Author> authors;
    private boolean isItForChildren;

    private aBook(){}
    public aBook(int ISBN, String title, Author author, boolean isItForChildren){}
    public aBook(int ISBN, String title,  ArrayList<Author> authors, boolean isItForChildren){}

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public boolean isItForChildren() {
        return isItForChildren;
    }

    public void setItForChildren(boolean itForChildren) {
        isItForChildren = itForChildren;
    }
}
