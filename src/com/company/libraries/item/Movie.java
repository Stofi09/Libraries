package com.company.libraries.item;

import com.company.libraries.creator.Director;



import java.util.ArrayList;
import java.util.List;

public class Movie extends Item implements IMovie{

    private List<Director> directors;

    public Movie(String title, Enum type,Director director) {
        super(title, type);
        this.directors = new ArrayList<>();
        this.directors.add(director);
    }
    public Movie(String title, Enum type,List<Director> director) {
        super(title, type);
        this.directors = new ArrayList<>(director);
    }

    public void addDirector(Director director){
        this.directors.add(director);
    }
    public void addDirectors(List<Director> directors){
        this.directors.addAll(directors);
    }

    private void initList() {
        if (this.directors == null) {
            this.directors = new ArrayList<>();
        }
    }
}
