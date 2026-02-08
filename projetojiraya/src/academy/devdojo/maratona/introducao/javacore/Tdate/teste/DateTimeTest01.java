package academy.devdojo.maratona.introducao.javacore.Tdate.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeTest01 {

    public static void main(String[] args) {
        LocalDateTime LocalDatetime = LocalDateTime.now();
        System.out.println(LocalDatetime);

        LocalTime time = LocalTime.parse("11:30:45");
        LocalDate date = LocalDate.parse("2010-11-12");

        LocalDateTime ltd1 = date.atTime(time);
        LocalDateTime ltd2 = time.atDate(date);

        System.out.println(ltd1);
        System.out.println(ltd2);



    }
}
