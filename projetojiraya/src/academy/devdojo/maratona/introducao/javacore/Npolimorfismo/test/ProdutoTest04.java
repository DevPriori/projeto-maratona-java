package academy.devdojo.maratona.introducao.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest04 {
    public static void main(String[] args) {
        Tomate tomate = new Tomate("Tomate Grande", 12);
        tomate.setValidade(123);

        CalculadoraImposto.impostoProduto(tomate);



    }
}
