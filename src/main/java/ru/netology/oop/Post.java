package ru.netology.oop;

public class Post {
    public String name;
    public String passport;
    public String phone;
    public String surname;

    public  boolean subscription;
    public int[] getBirthday(int d, int m, int y){
        FormDate formDate = new FormDate();
        int day = formDate.day(d);
        int mouth = formDate.mouth(m);
        int yea = formDate.yea(y);
        int[] birthday = new int[3];
        birthday[0] = day;
        birthday[1] = mouth;
        birthday[2] = yea;//{day, mouth,yea};
        return birthday;
    }

}
