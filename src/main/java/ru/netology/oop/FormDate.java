package ru.netology.oop;

public class FormDate {
    //public int day;

    public int day(int day){
        int d = 0;
        if ((day > 0) & (day <= 31)){
            return day;}

        return d;
    }
    public int mouth(int m){
        int m1 = -1;
        if((m > 1) & (m <=12)){
            return m;
        }
        return m1;
    };
    public int yea( int y) {
        int y1 = -1;
        if ((y > 1950) & (y <= 2024)){
            return y;
        }return y1;
    }
}
