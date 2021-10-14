package com.company.libraries.creator;

import com.company.libraries.item.Movie;

import java.util.List;

public  class Director extends aCreator{

    private  String name;
    private List<Movie> movies;

    public Director(String name){
        this.name = name;
    };

    public String getName() {
        return name;
    }
}
