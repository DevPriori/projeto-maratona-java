package academy.devdojo.maratona.introducao.javacore.Tdate.teste;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate local1 = LocalDate.now();
        LocalDate local2 = LocalDate.now().plusWeeks(2).plusDays(4);

        Period p1 = Period.between(local1, local2);
        Period p2 = Period.ofYears(2);
        Period p3 = Period.ofDays(10);
        Period p4 = Period.ofMonths(5);
        Period p5 = Period.ofWeeks(50);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(p5.getDays())).getMonths());
    }
}
