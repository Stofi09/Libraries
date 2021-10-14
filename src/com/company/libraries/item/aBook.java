package com.company.libraries.item;

import com.company.libraries.creator.Author;

import java.util.ArrayList;
import java.util.List;

public abstract class aBook extends Item {

    protected long ISBN;
    protected List<Author> authors;



    public aBook(long ISBN, String title, Author author,Enum type){
        super();
        this.ISBN = ISBN;
        this.title = title;
        this.authors = new ArrayList<>();
        this.authors.add(author);
        this.type = type;
        this.isAvailable = true;
    }
    public aBook(long ISBN, String title,  ArrayList<Author> authors, Enum type){
        super();
        this.ISBN = ISBN;
        this.title = title;
        this.authors = new ArrayList<>(authors);
        this.type = type;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }


    public void addAuthors(ArrayList<Author> authors) {
       this.authors.addAll(authors);
    }
    public void addAuthor(Author author){
        this.authors.add(author);
    }

    @Override
    public String toString() {
        return "aBook{" +
                "title='" + title + '\'' +
                ", type=" + type +
                ", timeTakenOut=" + timeTakenOut +
                ", isAvailable=" + isAvailable +
                ", ISBN=" + ISBN +
                ", authors=" + authors +
                '}';
    }
}
