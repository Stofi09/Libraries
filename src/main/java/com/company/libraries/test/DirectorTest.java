package com.company.libraries.test;

import com.company.libraries.creator.Director;
import com.company.libraries.enums.MovieType;
import com.company.libraries.item.Movie;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    @Test
    public void testDirectorName(){
        Director dir = new Director("Ben");
        assertEquals("The name was wrong","Ben",dir.getName());
    }

    @Test
    public void testDirectorMovies(){
        Director dir = new Director("Ben");
        Movie PearlHarbour = new Movie("Pearl Harbour", MovieType.BIOGRAPHY,(Director) dir);
        dir.addMovie(PearlHarbour);
        List<Movie> movies = new ArrayList<>();
        movies.add(PearlHarbour);
        assertEquals("The movie was wrong",movies,dir.getMovies());
    }



}
