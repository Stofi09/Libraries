package com.company.libraries;

import com.company.libraries.creator.Author;
import com.company.libraries.creator.aCreator;
import com.company.libraries.enums.BookType;
import com.company.libraries.item.Book;
import com.company.libraries.item.EBook;
import com.company.libraries.item.aBook;
import com.company.libraries.library.Library;

public class Main {

    public static void main(String[] args) {

        // init Authors
        aCreator JoshuaB = new Author("Joshua Block");

        // init Book
        aBook EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, BookType.SCIENCE);
        EBook EffectiveJavaEBook = new EBook(134685997 ,"Effective Java", (Author) JoshuaB, BookType.SCIENCE,"url");

        // init libraries
        Library EdinburghLibrary = new Library("Edinburgh","address");
        Library GlasgowLibrary = new Library("Glasgow","address");

        // Add books to libraries
        EdinburghLibrary.addBook(EffectiveJava);
        EdinburghLibrary.addEBook(EffectiveJavaEBook);

        EdinburghLibrary.rentBook(EffectiveJava);
        EdinburghLibrary.rentEBook(EffectiveJavaEBook);

    }


}

