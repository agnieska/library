package com.simplon.library;

/**
 * Created by Agnieszka on 14/02/17.
 */
public class Book {


    private String title;
    private int pages;

    public Book(String title, int pages) {
        if (pages>=0) {
            this.title = title;
            this.pages = pages;
        }
    }





}
