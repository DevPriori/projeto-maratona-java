package academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Test;

import academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio.Jogador;
import academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Ronaldinho");
        Time time1 = new Time("Dreamtem");

        jogador1.setTime(time1);
        jogador1.imprime();




    }
}
