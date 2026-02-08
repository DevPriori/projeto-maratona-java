package academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Test;

import academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio.Jogador;
import academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador jogador = new Jogador("Miguel");

        Jogador [] jogadores = {jogador};

        Time time = new Time("Seleção uruguaya");

        jogador.setTime(time);

        time.setJogadores(jogadores);

        jogador.imprime();
        time.imprime();




    }
}
