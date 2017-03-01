package com.simplon.library;

import java.util.*;

/**
 * Created by Agnieszka on 14/02/17.
 */
public class Book {


    private String title;
    private int pages;
    public static int shippingDay=1;

    public Book(String title, int pages) {
        if (pages>=0) {
            this.title = title;
            this.pages = pages;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
