package com.company.libraries;

import com.company.libraries.creator.Author;
import com.company.libraries.creator.Director;
import com.company.libraries.creator.aCreator;
import com.company.libraries.enums.BookType;
import com.company.libraries.enums.MovieType;
import com.company.libraries.item.*;
import com.company.libraries.library.Library;

public class Main {

    public static void main(String[] args) {

        // init Authors
        aCreator JoshuaB = new Author("Joshua Block");
        aCreator DanA = new Author("Dan Abnett");

        // init Directors
        aCreator MichaelB = new Director("Michael Bay");
        aCreator EricD = new Director("Eric Darnell");

        // init Book
        aBook EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, BookType.SCIENCE);
        EBook EffectiveJavaEBook = new EBook(134685997 ,"Effective Java Ebook", (Author) JoshuaB, BookType.SCIENCE,"url");
        aBook Saturnine = new Book (123,"Saturnine", (Author) DanA,BookType.FICTION);

        //init Movie
        Movie PearlHarbour = new Movie("Pearl Harbour", MovieType.BIOGRAPHY,(Director) MichaelB);
        Movie Armageddon = new Movie("Armageddon", MovieType.FICTION,(Director) MichaelB);
        MovieForKids Madagascar =  new MovieForKids("Madagascar", MovieType.CARTOON,(Director) EricD);

        //Add book to books
        ((Author) JoshuaB).addBook(EffectiveJava);
        ((Director) MichaelB).addMovie(PearlHarbour);
        ((Director) MichaelB).addMovie(Armageddon);
        ((Director) EricD).addMovie(Madagascar);

        // init libraries
        Library EdinburghLibrary = new Library("Edinburgh","address");
        Library GlasgowLibrary = new Library("Glasgow","address");

        // Add books to the library
        EdinburghLibrary.addBook(EffectiveJava);
        EdinburghLibrary.addEBook(EffectiveJavaEBook);

        // Add movies to the library
        EdinburghLibrary.addMovie(PearlHarbour);
        EdinburghLibrary.addMovie(Armageddon);

        // Rent books which are added and available
        EdinburghLibrary.rentBook(EffectiveJava);
        EdinburghLibrary.rentEBook(EffectiveJavaEBook);

        // Rent movies which are added and available
        EdinburghLibrary.rentMovie(PearlHarbour);
        EdinburghLibrary.rentMovie(Armageddon);

        // Try to rent books and movies which are not available or not in the library
        EdinburghLibrary.rentBook(EffectiveJava);
        EdinburghLibrary.rentBook(Saturnine);
        EdinburghLibrary.rentMovie(Madagascar);
        EdinburghLibrary.rentMovie(PearlHarbour);

    }


}

