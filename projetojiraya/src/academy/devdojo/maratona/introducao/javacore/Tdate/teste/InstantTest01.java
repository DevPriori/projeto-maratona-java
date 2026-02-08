package academy.devdojo.maratona.introducao.javacore.Tdate.teste;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();

        System.out.println(now.getEpochSecond());
        System.out.println(Instant.ofEpochSecond(10));
        System.out.println(Instant.ofEpochSecond(1_000_000_000));
        System.out.println(Instant.ofEpochSecond(10, 10000));
        System.out.println(now.getNano());
        System.out.println(now);
    }
}
