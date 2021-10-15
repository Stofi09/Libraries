package com.company.libraries.test;

import com.company.libraries.creator.Author;
import com.company.libraries.creator.aCreator;
import com.company.libraries.enums.BookType;
import com.company.libraries.item.EBook;
import com.company.libraries.item.EBookForKids;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EBookForKidsTest {

    @Test
    public void testEBookLink(){
        aCreator JoshuaB = new Author("Joshua Block");
        EBookForKids EffectiveJavaEBook = new EBookForKids(134685997 ,"Effective Java Ebook", (Author) JoshuaB, BookType.SCIENCE,"url");
        assertEquals("No link", "url",EffectiveJavaEBook.getLink());
    }
}
