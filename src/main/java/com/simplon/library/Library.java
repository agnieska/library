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
    public  int startHour;
    public  int closeHour;
    //private final int startHour=1;
    //private final int closeHour=7;
    //private final int storagemax=3;


    public Library () {
        name= "Paris20";
        startHour = 1;
        closeHour = 7;
        Books = new ArrayList<Book>();
        CDs = new ArrayList<CD>();
        DVDs = new ArrayList<DVD>();
    }
    public Library(String name,  int startHour, int closeHour) {
        this.name = name;
        this.startHour = startHour;
        this.closeHour = closeHour;
        this.Books = new ArrayList<Book>();
        this.CDs = new ArrayList<CD>();
        this.DVDs = new ArrayList<DVD>();
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
        int indexOf=-2000;
        if ((this.DVDs.contains(dvd)) || (DVDs.size()>=3)) {
            if (this.DVDs.contains(dvd))
            System.out.println("Ce DVD existe deja");
            else if (DVDs.size()>=3){
                System.out.println("la bibliotheque est remplie");
                indexOf=-1000;}
        }
        else {
            this.DVDs.add(dvd);
            indexOf=this.DVDs.indexOf(dvd);
            //indexOf= this.DVDs.indexOf(dvd);
        }
        return indexOf;
    }

    public ArrayList<Book>  putBooks (ArrayList<Book> newBooks) {
        this.Books.addAll(newBooks);
        return this.Books;
    }

    public ArrayList<CD>  putCDs (ArrayList<CD> newCD) {
        this.CDs.addAll(newCD);
        return this.CDs;
    }

    public ArrayList<DVD>  putDVDs (ArrayList<DVD> newDVD) {

        if (this.DVDs.size() + newDVD.size()>3)
            System.out.println("Vous pouvez ajouter seulement "+(3-this.DVDs.size())+"elements");
        else if (this.DVDs.size() + newDVD.size() <=3)
        {
            boolean contains = false;
                for (DVD a: DVDs)
                {
                    if (this.DVDs.contains(a))
                        System.out.println("La bibliotheque possede deja le DVD "+a.toString()+" sous indexe "+ DVDs.indexOf(a)+"\n"+"Veuillez corriger votre liste ");
                    contains = true;
                }
            if  (contains ==false)
            this.DVDs.addAll(newDVD);
        }
        return this.DVDs;



        /*
        public ArrayList<DVD>  putDVDs (ArrayList<DVD> newDVD){

        for (DVD a: DVDs)
        if (!(this.DVDs.contains(a)) && (this.DVDs.size()<3))
         this.DVDs.addAll(a);
        }
         */
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
        else {isOpen=false;
        System.out.println ("Desole, trop tard");}
        return isOpen;
    }

    private float readHour (float heure) {

        if ((heure>=0.00)&& (heure<=24.00))   return heure;
        else throw new IllegalArgumentException();
    }





}
