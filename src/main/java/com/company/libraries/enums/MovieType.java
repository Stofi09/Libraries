package com.company.libraries.enums;

public enum MovieType {

    CARTOON("Cartoon"),  FICTION("Fiction"),NONFICTION("Non Fiction"),SCIENCE("Science"),POETRY("Poetry"),BIOGRAPHY("Biography");

    String name;
    MovieType(String name){
        this.name = name;
    };
}
