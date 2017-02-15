package com.simplon.library;

/**
 * Created by Agnieszka on 14/02/17.
 */
public class DVD  extends CD {



    boolean threeD;
    MovieType kind;

    public DVD(String title, int time, boolean threeD, MovieType kind) {
        super(title, time);
        this.threeD = threeD;
        this.kind = kind;
    }

    public boolean isThreeD() {
        return threeD;
    }

    public MovieType getKind() {
        return kind;
    }




}
