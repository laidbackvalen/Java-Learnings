package time;

import java.util.Calendar;
import java.util.TimeZone;

public class Calender_G {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());

        System.out.println(TimeZone.getTimeZone("US/Pacific-New"));
        System.out.println(TimeZone.getTimeZone("ASIA/Singapore"));


    }
}
