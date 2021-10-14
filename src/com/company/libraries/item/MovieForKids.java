package com.company.libraries.item;

import com.company.libraries.creator.Director;

import java.util.List;

public class MovieForKids extends Movie implements AgeAppropriate {

    public MovieForKids(String title, Enum type, Director director) {
        super(title, type, director);
    }

    public MovieForKids(String title, Enum type, List<Director> director) {
        super(title, type, director);
    }
}
