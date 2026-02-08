package academy.devdojo.maratona.introducao.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {

        Produto produto = new Tomate("Irlandes", 3);

        System.out.println(produto.getNome());
        System.out.println(produto.cauladoraTaxa());

    }
}
