package academy.devdojo.maratona.introducao.javacore.Tdate.teste;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTes01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2002,9,24,17,0,0);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.ERAS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
        System.out.println(ChronoUnit.HOURS.between(aniversario, now));

    }
}
