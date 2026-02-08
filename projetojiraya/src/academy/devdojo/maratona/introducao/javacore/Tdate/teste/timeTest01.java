package academy.devdojo.maratona.introducao.javacore.Tdate.teste;

import academy.devdojo.maratona.introducao.javacore.GExercicio.dominio.test.Local;
import academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio.Time;

import java.time.LocalTime;

public class timeTest01 {

    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10,10, 10 );

        System.out.println(time.getHour());
        System.out.println(time.getNano());
        System.out.println(time.getMinute());

    }
}
