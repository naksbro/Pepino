package utils;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {
    public static String getCurrentFormattedDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return formatter.format(date);
    }

    public static String currentDateTime(){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyy");
        LocalDateTime now = LocalDateTime.now();
        return date.format(now);
    }

    public static String plusDays (int plusDay) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.now().plusDays(plusDay);
        return formatter.format(date);

    }

}
