package ArrayList_Practice_Set;

import java.util.Date;

public class Q2_Print_Time_Using_Date_Class {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt.getHours()+":"+dt.getMinutes()+":" +dt.getSeconds());
    }
}
