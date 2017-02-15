package com.simplon.library;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Created by Agnieszka on 14/02/17.
 */
public class Library {



    private String name;

    private ArrayList<Book> Books;
    private ArrayList<CD> CDs;
    private ArrayList<DVD> DVDs;

    public static int startHour=1;
    public static int closeHour=7;


    public Library (String name) {
        name= name;
        Books = new ArrayList<Book>();
        CDs = new ArrayList<CD>();
        DVDs = new ArrayList<DVD>();
    }


    public String getName() {
        return name;
    }


    public int  putBook(Book book) {
        this.Books.add(book);
        return this.Books.indexOf(book);
    }


    public int putCD(CD cd) {
        this.CDs.add(cd);
        return this.CDs.indexOf(cd);
    }


    public int putDVD(DVD dvd) {
        if (DVDs.size()<3)
            this.DVDs.add(dvd);
        else
            System.out.println ("Desole, trop tard");
        return this.DVDs.indexOf(dvd);
    }



    public boolean isOpen (float heure) {
        boolean isOpen;
        try {
            readHour(heure);
        }
        catch(InputMismatchException e) {
            System.out.println("Saisie hors intervalle.");
        }

        if ((heure<=this.closeHour)&&(heure>=this.startHour)) isOpen=true;
        else isOpen=false;
        return isOpen;

    };

    private float readHour (float heure) {

        if ((heure>=0.00)&& (heure<=24.00))   return heure;
        else throw new IllegalArgumentException();

    }





}
