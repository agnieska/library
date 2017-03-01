package com.simplon.library;

import java.util.*;

/**
 * Created by Agnieszka on 14/02/17.
 */
public class DVD  extends CD {



    private boolean threeD;
    private MovieType kind;
    public static int shippingDay=2;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DVD dvd = (DVD) o;

        if (isThreeD() != dvd.isThreeD()) return false;
        return getKind() == dvd.getKind();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isThreeD() ? 1 : 0);
        result = 31 * result + getKind().hashCode();
        return result;
    }
}
