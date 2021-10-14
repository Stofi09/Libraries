package com.company.libraries.item;

import com.company.libraries.creator.aCreator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Item {

    protected String title;
    protected Enum type;
    protected LocalDate timeTakenOut;
    protected boolean isAvailable;

    public Item(String title,  Enum type){
        this.isAvailable = true;
    }
    public Item() {}




    public void borrowItem(){
        this.setUnAvailable();
        this.setTime(LocalDate.now());
    }
    public String getTitle() {
        return title;
    }

    public Enum getType() {
        return type;
    }

    public LocalDate getTime() {
        return timeTakenOut;
    }

    private void setTime(LocalDate time) {
        this.timeTakenOut = time;
    }

    public void setUnAvailable(){
        this.isAvailable = false;
    }
    public void setAvailable(){
        this.isAvailable = true;
    }
    public boolean getAvailability(){
        return  this.isAvailable;
    }
}
