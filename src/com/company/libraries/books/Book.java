package com.company.libraries.books;

import com.company.libraries.author.Author;

import java.util.ArrayList;

public class Book extends aBook{

    private int ISBN;
    private String title;
    private ArrayList<Author> authors;
    private boolean isItForChildren;

    public Book(int ISBN, String title, Author author, boolean isItForChildren) {
        super(ISBN, title, author, isItForChildren);
    }

    public Book(int ISBN, String title, ArrayList<Author> authors, boolean isItForChildren) {
        super(ISBN, title, authors, isItForChildren);
    }

    @Override
    public int getISBN() {
        return ISBN;
    }

    @Override
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public ArrayList<Author> getAuthors() {
        return authors;
    }

    @Override
    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean isItForChildren() {
        return isItForChildren;
    }

    @Override
    public void setItForChildren(boolean itForChildren) {
        isItForChildren = itForChildren;
    }
}
