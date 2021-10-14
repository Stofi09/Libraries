package com.company.libraries.library;

import com.company.libraries.item.*;


import java.util.HashMap;

public  class Library {

    protected String name;
    protected String address;

    private HashMap<String, aBook> booksByTitle;
    private HashMap<String, Movie> moviesByTitle;
    private HashMap<String, EBook> eBooksByTitle;

    public Library(String name, String address){
        this.name = name;
        this.address = address;
        initMaps();
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    private void initMaps(){
        this.booksByTitle = new HashMap<>();
        this.eBooksByTitle = new HashMap<>();
        this.moviesByTitle = new HashMap<>();
    }

    public void addBooks(HashMap<String, aBook> books) {
        this.booksByTitle.putAll(books);
    }

    public void addBook(aBook book) {
        this.booksByTitle.put(book.getTitle(),book);
    }

    public void addEBooks(HashMap<String,EBook> books){
        this.eBooksByTitle.putAll(books);
    }

    public void addEBook(EBook book){
        this.eBooksByTitle.put(book.getTitle(),book);
    }

    public void addMovies(HashMap<String,Movie> movies){
        this.moviesByTitle.putAll(movies);
    }

    public void addMovie(Movie movie){
        this.moviesByTitle.put(movie.getTitle(),movie);
    }

    public HashMap<String,aBook> getBooks() {
        return this.booksByTitle;
    }
    public HashMap<String,EBook> getEBooks() {
        return this.eBooksByTitle;
    }
    public HashMap<String,Movie> getMovies() {
        return this.moviesByTitle;
    }

    /*How to reuse the check/ rent methods? .getClass???*/
    public void rentEBook(aBook book){
        if(checkEBook(book)){
            this.eBooksByTitle.get(book.getTitle()).borrowItem();
            System.out.println("Here is the book: " + book);
        }else{
            System.err.println("We don't have this book: " +book);
        }
    }

    public void rentBook(aBook book){
           if(checkBook(book)){
               if(this.booksByTitle.get(book.getTitle()).getAvailability()){
                   this.booksByTitle.get(book.getTitle()).borrowItem();
                   System.out.println("Here is the book: " + book);
               } else {
                   System.out.println("We have that book, but unfortunately it is not available at the moment.");
               }
           }else {
               System.err.println("We don't have this book: " +book.getTitle());
           }
    }
    public void rentMovie(Movie movie){
        System.out.println(movie);
        if(checkMovie(movie)){
            this.moviesByTitle.get(movie.getTitle()).borrowItem();
            System.out.println("Here is the book: " + movie);
        }else{
            System.err.println("We don't have this book: " +movie.getTitle());
        }
    }


    private boolean checkEBook(aBook book){
        if(this.eBooksByTitle.containsKey(book.getTitle())){
            return true;
        }else {
            return false;
        }
    }

    private boolean checkBook(aBook book){
        if(this.booksByTitle.containsKey(book.getTitle())){
            return true;
        }else {
            return false;
        }
    }
   private boolean checkMovie(Movie movie){
        if(this.moviesByTitle.containsKey(movie.getTitle())){
            return true;
       }else {
            return false;
       }
   }

    @Override
    public String toString() {
        return "aLibrary{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", booksByTitle=" + booksByTitle +
                ", moviesByTitle=" + moviesByTitle +
                ", eBooksByTitle=" + eBooksByTitle +
                '}';
    }
}
