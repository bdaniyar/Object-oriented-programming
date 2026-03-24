package io.model;

import java.io.Serializable;

public class BookPr3 implements Serializable{

    private String title;
    private String author;
    private transient int visitCount;

    public BookPr3(String title, String author){
        this.title = title;
        this.author = author;
        this.visitCount = 0;
    }

    public void incrementVisit(){
        visitCount++;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               ", Author: " + author +
               ", Visits: " + visitCount;
    }
}
