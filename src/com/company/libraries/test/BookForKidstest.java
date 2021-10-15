package com.company.libraries.test;

import com.company.libraries.creator.Author;
import com.company.libraries.creator.aCreator;
import com.company.libraries.enums.BookType;
import com.company.libraries.item.BookForKids;
import com.company.libraries.item.EBookForKids;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookForKidstest {

    @Test
    public void testBookLink(){
        aCreator JoshuaB = new Author("Joshua Block");
        BookForKids EffectiveJavaEBook = new BookForKids(134685997 ,"Effective Java Ebook", (Author) JoshuaB, BookType.SCIENCE);
        assertEquals("No link", 134685997,EffectiveJavaEBook.getISBN());
    }
}
