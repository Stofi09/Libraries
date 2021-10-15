package com.company.libraries.test;


import com.company.libraries.creator.Author;
import com.company.libraries.creator.Director;
import com.company.libraries.creator.aCreator;
import com.company.libraries.enums.BookType;
import com.company.libraries.enums.MovieType;
import com.company.libraries.item.Book;
import com.company.libraries.item.EBook;
import com.company.libraries.item.MovieForKids;
import com.company.libraries.item.aBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MovieForKidsTest {

    @Test
    public void testMovieForKidsTitle(){
        aCreator EricD = new Director("Eric Darnell");
        MovieForKids Madagascar =  new MovieForKids("Madagascar", MovieType.CARTOON,(Director) EricD);
        assertEquals("Thats not the title", "Madagascar", Madagascar.getTitle());
    }

}
