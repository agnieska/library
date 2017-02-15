package com.simplon.library;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


   //Unit test for simple App.


public class LibraryTest
    extends TestCase  {




/*

    public void testConstrVide() {

        // set
        String name = "Paris20";
        int startHour = 1;
        int closeHour = 7;
        String testName;
        int testStartHour;
        int testCloseHour;

        // test
        Library a = new Library();
        testName = a.getName();
        testCloseHour = a.closeHour;
        testStartHour= a.startHour;
        // assert
        assertTrue((testCloseHour==7)&&(testStartHour==1)&&(testName.equals("Paris20")));
    }


    public void testConstrPar() {

        // set
        String name = "Paris20";
        int startHour = 1;
        int closeHour = 7;
        String testName;
        int testStartHour;
        int testCloseHour;

        // test
        Library a = new Library(name, startHour, closeHour);
        testName = a.getName();
        testCloseHour = a.closeHour;
        testStartHour= a.startHour;
        // assert
        assertTrue((testCloseHour==7)&&(testStartHour==1)&&(testName.equals("Paris20")));

    }




 public  void testPutAllBooks() {

        // set
        Library Paris20 = new Library("Paris20", 1,7);
        Book b1 = new Book("Titre1", 96);
        Book b2 = new Book("Titre2", 100);
        Book b3 = new Book("Titre3", 1000);
        Book b4 = new Book("Titre4", 1);
        ArrayListe l1 = new ArrayListe <Book> (b1,b2,b3,b4)

        // test
        int result = Paris20.putBooks(b1);
        // assert
        assertEquals(l1, result);
    }



    public  void testPutAllCDs() {

        // set
        Library Paris20 = new Library("Paris20", 1,7 );
        CD c1 = new CD("Titre1", 96);
        CD c2 = new CD("Titre2", 100);
        CD c3 = new CD("Titre3", 1);
        CD c4 = new CD("Titre4", 1000);
        ArrayListe l1 = new ArrayListe <CD> (c1,c2,c3,c4)
        // test
        int result = Paris20.putCD(c1);
        // assert
        assertEquals(l1, result);
    }




 public  void testPutAllDVDs() {

        // set
        Library Paris20 = new Library("Paris20",1,7 );
        CD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        // test
        int result = Paris20.putCD(d1);
        // assert
        assertEquals(l1, result);
    }


    // @Test(timeout=1000)
    public  void testPutOneBook() {

        // set
        Library Paris20 = new Library("Paris20", 1,7);
        Book b1 = new Book("Titre1", 96);
        // test
        int result = Paris20.putBook(b1);
        // assert
        assertEquals(0, result);
    }


   public  void testPutOneCD() {

        // set
        Library Paris20 = new Library("Paris20", 1,7 );
        CD c1 = new CD("Titre1", 96);
        // test
        int result = Paris20.putCD(c1);
        // assert
        assertEquals(0, result);
    }


   public  void testPutOneDVD() {

        // set
        Library Paris20 = new Library("Paris20",1,7 );
        CD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        CD d2 = new DVD("Titre2", 100, false, MovieType.HORROR);
        CD d3 = new DVD("Titre3", 1, true, MovieType.HORROR);
        CD d4 = new DVD("Titre4", 1000, false, MovieType.HORROR);
        ArrayListe l1 = new ArrayListe <DVD> (d1,d2,d3,d4)
        // test
        int result = Paris20.putCD(d1);
        // assert
        assertEquals(0, result);
    }
    public  void testPutDVD1234() {

        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        CD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        CD d2 = new DVD("Titre2", 1, true, MovieType.ACTION);
        CD d3 = new DVD("Titre3", 10000, true, MovieType.FUN);
        CD d4 = new DVD("Titre4", 60, true, MovieType.MUSICAL);// test


        int result = Paris20.putCD(d1);
        // assert
        assertEquals(0, result);
    }



public boolean testIsOpen () {
    // set
    Library Paris20 = new Library("Paris20", 1, 7);
}

*/



    /**
     * Create the test case
     * @param testName name of the test case
     */
    public LibraryTest(String testName )
    {
        super( testName );
    }


    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LibraryTest.class );
    }


    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }




} // classe
