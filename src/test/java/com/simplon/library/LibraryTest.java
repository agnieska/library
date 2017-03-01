package com.simplon.library;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;


//Unit test for simple App.


public class LibraryTest
    extends TestCase {


   // @Test
    public void putBook_with_two_books(){
        //set
        Library Paris20 = new Library("Paris20", 1, 7);
        ArrayList<Book> l1 = new ArrayList<Book>();
        Book b1 = new Book("Titre1", 96);
        Book b2 = new Book("Titre2", 100);
        l1.add(b1);
        l1.add(b2);

        // test
        ArrayList result = Paris20.putBooks(l1);
        // asssert
        assertEquals(2,result.size());
    }


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
        testStartHour = a.startHour;
        // assert
        assertTrue((testCloseHour == 7) && (testStartHour == 1) && (testName.equals("Paris20")));
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
        testStartHour = a.startHour;
        // assert
        assertTrue((testCloseHour == 7) && (testStartHour == 1) && (testName.equals("Paris20")));

    }


    public void testPut4Books() {

        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        ArrayList<Book> l1 = new ArrayList<Book>();
        Book b1 = new Book("Titre1", 96);
        Book b2 = new Book("Titre2", 100);
        Book b3 = new Book("Titre3", 1000);
        Book b4 = new Book("Titre4", 1);
        l1.add(b1);
        l1.add(b2);
        l1.add(b3);
        l1.add(b4);

        // test
        ArrayList<Book> listeTest = Paris20.putBooks(l1);
        int result = listeTest.size();
        // assert
        assertEquals(4, result);
    }


    public void testPut4CDs() {

        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        ArrayList<CD> l1 = new ArrayList<CD>();
        CD c1 = new CD("Titre1", 96);
        CD c2 = new CD("Titre2", 100);
        CD c3 = new CD("Titre3", 1);
        CD c4 = new CD("Titre4", 1000);
        l1.add(c1);
        l1.add(c2);
        l1.add(c3);
        l1.add(c4);

        // test
        ArrayList<CD> result = Paris20.putCDs(l1);
        // assert
        assertEquals(l1, result);
    }


    public void testPut2DVDs() {

        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        ArrayList<CD> l1 = new ArrayList<CD>();
        CD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        CD d2 = new DVD("Titre2", 100, true, MovieType.ACTION);

        l1.add(d1);
        l1.add(d2);
        // test
        ArrayList<CD> result = Paris20.putCDs(l1);
        // assert
        assertEquals(l1, result);
    }


    public void testPut4DVDs() {
        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        ArrayList<DVD> l1 = new ArrayList<DVD>();
        DVD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        DVD d2 = new DVD("Titre2", 100, true, MovieType.ACTION);
        DVD d3 = new DVD("Titre3", 1000, true, MovieType.MUSICAL);
        DVD d4 = new DVD("Titre4", 1, true, MovieType.FUN);
        l1.add(d1);
        l1.add(d2);
        l1.add(d3);
        l1.add(d4);
        ArrayList<DVD> l2 = new ArrayList<DVD>();

        // test
        ArrayList<DVD> result = Paris20.putDVDs(l1);

        // assert
        assertEquals(l2, result);
    }


    public void testPut2x2DVDs() {
        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        ArrayList<DVD> l1 = new ArrayList<DVD>();
        DVD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        DVD d2 = new DVD("Titre2", 100, true, MovieType.ACTION);
        l1.add(d1);
        l1.add(d2);

        ArrayList<DVD> l2 = new ArrayList<DVD>();
        DVD d3 = new DVD("Titre3", 1000, true, MovieType.MUSICAL);
        DVD d4 = new DVD("Titre4", 1, true, MovieType.FUN);
        l2.add(d3);
        l2.add(d4);

        ArrayList<DVD> expected = l1;

        // test

        ArrayList<DVD> result = new ArrayList<DVD>();
        result = Paris20.putDVDs(l1);
        result = Paris20.putDVDs(l2);
        int size =result.size();

        // assert
        assertEquals(expected, result);
        assertEquals(2,size);
    }

    public void testPutSameDVDs() {
        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        ArrayList<DVD> l1 = new ArrayList<DVD>();
        DVD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        DVD d2 = new DVD("Titre2", 100, true, MovieType.ACTION);
        l1.add(d1);
        l1.add(d2);
        ArrayList<DVD> listTest = Paris20.putDVDs(l1);
        ArrayList<DVD> l2 = new ArrayList<DVD>();
        DVD d3 = new DVD("Titre2", 100, true, MovieType.ACTION);
        l2.add(d3);
        ArrayList<DVD> expected = Paris20.putDVDs(l1);

        // test
        ArrayList<DVD> result = expected;
        result = Paris20.putDVDs(l2);
        //int size =result.size();


        // assert
        assertEquals(expected, result);
        //assertEquals(2, result);
    }

    // @Test(timeout=1000)
    public void testPutOneBook() {

        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        Book b1 = new Book("Titre1", 96);
        // test
        int result = Paris20.putBook(b1);
        // assert
        assertEquals(0, result);
    }


    public void testPutOneCD() {

        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        CD c1 = new CD("Titre1", 96);
        // test
        int result = Paris20.putCD(c1);
        // assert
        assertEquals(0, result);
    }


    public void testPutOneDVD() {

        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        DVD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        // test
        int result = Paris20.putDVD(d1);
        // assert
        assertEquals(0, result);
    }


    public void testPutDVD123() {

        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        DVD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        int result = Paris20.putDVD(d1);
        DVD d2 = new DVD("Titre2", 100, true, MovieType.ACTION);
        result = Paris20.putDVD(d2);
        DVD d3 = new DVD("Titre3", 1000, true, MovieType.MUSICAL);

        // test
        result = Paris20.putDVD(d3);
        // assert
        assertEquals(2, result);
    }

    public void testPutDVD1234() {

        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        DVD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        int result = Paris20.putDVD(d1);
        DVD d2 = new DVD("Titre2", 100, true, MovieType.ACTION);
        result = Paris20.putDVD(d2);
        DVD d3 = new DVD("Titre3", 1000, true, MovieType.MUSICAL);
        result = Paris20.putDVD(d3);
        DVD d4 = new DVD("Titre4", 1, true, MovieType.FUN);
        // test
        result = Paris20.putDVD(d4);
        // assert
        assertEquals(-1000, result);
    }

    public void testPutTheSameDVD() {

        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        DVD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        int result = Paris20.putDVD(d1);
        DVD d2 = new DVD("Titre1", 96, true, MovieType.HORROR);

        // test
        result = Paris20.putDVD(d2);
        // assert
        assertEquals(-2000, result);
    }

    public void testIsOpen() {
        // set
        Library Paris20 = new Library("Paris20", 1, 7);
        // test
        boolean result1 = Paris20.isOpen(4F);
        boolean result2 = Paris20.isOpen(20F);
        // assert
        assertEquals(true, result1);
        assertEquals(false, result2);
    }





    /**
     * Create the test case
     * @param testName name of the test case

    public LibraryTest(String testName )
    {
        super( testName );
    }
*/

    /**
     * @return the suite of tests being tested

    public static Test suite()
    {
        return new TestSuite( LibraryTest.class );
    }
*/

    /**
     * Rigourous Test :-)

    public void testApp()
    {
        assertTrue( true );
    }

*/


} // classe
