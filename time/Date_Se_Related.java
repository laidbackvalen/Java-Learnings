package time;

import java.util.Calendar;
import java.util.Date;


import static java.lang.System.currentTimeMillis;



//Java STORES TIME IN MILISCECONDS //IT WILL START COUNTING FROM 1 JAN 1970
//IT USES long DATATYPE TO STORE MILIS
public class Date_Se_Related {
    public static void main(String[] args) {

        System.out.println("Miliseconds : "+System.currentTimeMillis());
        System.out.println("Converting Milisceconds Into Years From 1 Jan 1970 : " +
                " "+currentTimeMillis()/31556952000.); //this will return years //To get Years divide it by 31556952000.


        System.out.println(System.currentTimeMillis()/1000/3600/24/365);        //for Years
        //                                          minisec/minute/hours/days

        System.out.println(System.currentTimeMillis()/1000/3600);               //hours
        System.out.println(System.currentTimeMillis()/1000/3600/24);             //Days


//        while (true) {
//            System.out.println(System.currentTimeMillis());
//        }

        System.out.println(Long.MAX_VALUE);


        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getYear()); //years counting from 1900



    }
}
