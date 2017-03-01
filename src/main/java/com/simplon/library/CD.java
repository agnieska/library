package com.simplon.library;

import java.util.*;

/**
 * Created by Agnieszka on 14/02/17.
 */
public class CD {

    protected String title;
    protected int time;
    public static int shippingDay=3;


    public CD(String title, int time) {
        if (time>=0) {
            this.title = title;
            this.time = time;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CD cd = (CD) o;

        if (getTime() != cd.getTime()) return false;
        return getTitle().equals(cd.getTitle());
    }

    @Override
    public int hashCode() {
        int result = getTitle().hashCode();
        result = 31 * result + getTime();
        return result;
    }
}
