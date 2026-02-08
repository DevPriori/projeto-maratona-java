package academy.devdojo.maratona.introducao.javacore.Tdate.teste;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.DECEMBER.getValue());
        LocalDate date = LocalDate.of(2010, 6, 23);
        LocalDate agora = LocalDate.now();
        System.out.println(date);
        System.out.println(agora);
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.atStartOfDay());
        System.out.println(date.atStartOfDay());
        System.out.println(date.getChronology());

    }
}
