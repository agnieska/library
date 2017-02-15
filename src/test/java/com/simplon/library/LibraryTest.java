package com.simplon.library;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


   //Unit test for simple App.


public class LibraryTest
    extends TestCase  {


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

/*


public void testConstructeur() {

// set
       String name = "Paris20";
       Int startHour = 1;
       Int closeHour = 7;
       String testName;
       Int testStartHour;
       Int testCloseHour;

// test
Library a = new Library(String name,  int startHour, int closeHour);
testName = a.get


    public void
    // @Test(timeout=1000)
    public  void testPutBook() {

        // set
        Library Paris20 = new Library("Paris20");
        Book b1 = new Book("Titre1", 96);
        // test
        int result = Paris20.putBook(b1);
        // assert
        assertEquals(0, result);
    }


    public  void testPutCD() {

        // set
        Library Paris20 = new Library("Paris20");
        CD c1 = new CD("Titre1", 96);
        // test
        int result = Paris20.putCD(c1);
        // assert
        assertEquals(0, result);
    }


    public  void testPutDVD() {

        // set
        Library Paris20 = new Library("Paris20");
        CD d1 = new DVD("Titre1", 96, true, MovieType.HORROR);
        // test
        int result = Paris20.putCD(d1);
        // assert
        assertEquals(0, result);
    }


    public  void testPutDVD1234() {

        // set
        Library Paris20 = new Library("Paris20");
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
    Library Paris20 = new Library("Paris20");

}

*/
} // classe
