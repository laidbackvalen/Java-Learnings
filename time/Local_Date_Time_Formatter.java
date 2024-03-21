package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Local_Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM_yyyy");
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy-- G -- H:m a -- E -- D");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;


        String myDate = dt.format(df);
        String myDate1 = dt.format(df1);
        String myDate2 = dt.format(df2);



        System.out.println(myDate);
        System.out.println(myDate1);
        System.out.println(myDate2);

    }
}
