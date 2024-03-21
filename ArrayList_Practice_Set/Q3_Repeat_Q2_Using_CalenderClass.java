package ArrayList_Practice_Set;

import java.util.Calendar;

import static java.util.Calendar.HOUR;

public class Q3_Repeat_Q2_Using_CalenderClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();



        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
