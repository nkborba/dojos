package com.nkborba;

public class solution {

    public boolean isALeapOrNot(int year){

        boolean leap = false;

        if(year/4 == 0){
            leap = true;
        } else if (year/100 == 0){
            leap = false;
        } else if (year/4 == 0){
            leap = true;
        }

        return leap;
    }

}
