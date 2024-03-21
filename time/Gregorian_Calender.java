package time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian_Calender {
    public static void main(String[] args) {
        Calendar cg = Calendar.getInstance();  //abstract class

        System.out.println(cg.getTime());
        System.out.println("Date : "+cg.get(Calendar.DATE));
        System.out.println("Hour : "+cg.get(Calendar.HOUR));
        System.out.println("Hour : "+cg.get(Calendar.HOUR_OF_DAY));
        System.out.println("Day Of The Week Starting From Sunday : "+cg.get(Calendar.DAY_OF_WEEK));
        System.out.println("Time : "+cg.get(Calendar.HOUR_OF_DAY)+":"+ cg.get(Calendar.MINUTE));



        GregorianCalendar calender = new GregorianCalendar(); //concrete class
        System.out.println(calender.isLeapYear(2024));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[300]);
        System.out.println(TimeZone.getAvailableIDs()[12]);
        System.out.println(TimeZone.getAvailableIDs()[57]);
        System.out.println(TimeZone.getAvailableIDs()[10]);
        System.out.println(cg.getTimeZone().getID());
    }
}
