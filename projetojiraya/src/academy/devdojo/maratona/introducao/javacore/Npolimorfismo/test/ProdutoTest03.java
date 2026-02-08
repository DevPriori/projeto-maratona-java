package academy.devdojo.maratona.introducao.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto tomate = new Tomate("Tomate Grande", 12);

        CalculadoraImposto.impostoProduto(tomate);
    }
}
