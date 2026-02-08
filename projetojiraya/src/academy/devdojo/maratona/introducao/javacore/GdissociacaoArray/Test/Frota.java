package academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Test;

import academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio.Entregadores;
import academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio.Restaurante;

public class Frota {
    public static void main(String[] args) {
        Entregadores entregador = new Entregadores("Miguel", "Noitada");
        Entregadores entregador2 = new Entregadores("juca", "Noitada");

        Entregadores entregadores [] = {entregador};

        Restaurante restaurante = new Restaurante("sushi",entregadores);

        restaurante.setRestaurante("sushivibe");
        entregador.setRestaurante(restaurante);
        restaurante.imprime();

        for(Entregadores entregadores1: entregadores){
            System.out.println(entregadores1);
        }




    }
}
