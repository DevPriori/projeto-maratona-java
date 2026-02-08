package academy.devdojo.maratona.introducao.javacore.EintroducaoBlocosDeInicializacao.Test;

import academy.devdojo.maratona.introducao.javacore.EintroducaoBlocosDeInicializacao.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();


        for(int episodios: anime.getEpisodios()){
            System.out.print(episodios + " ");
        }
    }
}
