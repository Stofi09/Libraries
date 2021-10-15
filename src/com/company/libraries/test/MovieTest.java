package com.company.libraries.test;


import com.company.libraries.creator.Author;
import com.company.libraries.creator.Director;
import com.company.libraries.creator.aCreator;
import com.company.libraries.enums.BookType;
import com.company.libraries.enums.MovieType;
import com.company.libraries.item.*;
import com.company.libraries.library.Library;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    @Test
    public void testMovieDirectors(){
        aCreator MichaelB = new Director("Michael Bay");
        Movie PearlHarbour = new Movie("Pearl Harbour", MovieType.BIOGRAPHY,(Director) MichaelB);
        List<Director> dir = new ArrayList<>();
        dir.add((Director) MichaelB);
        assertEquals("not the right dir", dir,PearlHarbour.getDirectors());
    }

    @Test
    public void testMovieDirectorsAdd(){
        aCreator MichaelB = new Director("Michael Bay");
        Movie PearlHarbour = new Movie("Pearl Harbour", MovieType.BIOGRAPHY,(Director) MichaelB);
        List<Director> dir = new ArrayList<>();
        dir.add((Director) MichaelB);
        aCreator MichaelC = new Director("Michael Bay");
        PearlHarbour.addDirector((Director) MichaelC);
        dir.add((Director) MichaelC);
        assertEquals("not the right dir", dir,PearlHarbour.getDirectors());
    }
}
