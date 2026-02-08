package academy.devdojo.maratona.introducao.javacore.DintroducaoContrutores.test;

import academy.devdojo.maratona.introducao.javacore.DintroducaoContrutores.dominio.Anime01;

public class Animetest01 {
    public static void main(String[] args) {

        Anime01 anime = new Anime01();

        anime.init("Naturo", 10, "NAturo", "ação");

        anime.imprime();


    }
}
