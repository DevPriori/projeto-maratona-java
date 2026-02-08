package academy.devdojo.maratona.introducao.javacore.Tdate.teste;

import academy.devdojo.maratona.introducao.javacore.GExercicio.dominio.test.Local;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Durationteste01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfter10H = LocalDateTime.now().plusHours(10);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowAftes2M = LocalTime.now().plusMinutes(2);
        LocalDateTime now2 = LocalDateTime.now();
        Duration d1 = Duration.between(now, nowAfter10H);
        Duration d2 = Duration.between(timeNow, timeNowAftes2M);

        Duration d3 = Duration.between(now, now2);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }
}
