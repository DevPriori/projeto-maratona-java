package academy.devdojo.maratona.introducao.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class PolimorfismosTest01 {
    public static void main(String[] args) {

        Computador computador = new Computador("Asus 1409", 4000);

        CalculadoraImposto.impostoComputador(computador);
        Tomate tomate = new Tomate("Tomate italino", 20);
        CalculadoraImposto.impostoTomate(tomate);


    }
}
