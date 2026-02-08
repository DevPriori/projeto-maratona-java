package academy.devdojo.maratona.introducao.javacore.Npolimorfismo.servico;

import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio.Tomate;
import org.w3c.dom.ls.LSOutput;

public class CalculadoraImposto {

    public static void impostoComputador(Computador computador){
        System.out.println("Imprimindo relatiorio");
        double imposto = computador.cauladoraTaxa();
        System.out.println("computador "+computador.getNome());
        System.out.println("valor " + computador.getValor());
        System.out.println("imposto " + imposto);


    }

    public static void impostoTomate(Tomate tomate){
        System.out.println("imprimindo relatorio");
        double imposto = tomate.cauladoraTaxa();
        System.out.println("tomate do tipo: "+ tomate.getNome());
        System.out.println("tomate valor: "+tomate.getValor());
        System.out.println("imposto: " +imposto);
    }

    public static void impostoProduto(Produto produto){
        System.out.println("imprimindo relatorio");
        double imposto = produto.cauladoraTaxa();
        System.out.println("produto do tipo: "+ produto.getNome());
        System.out.println("produto valor: "+produto.getValor());
        System.out.println("imposto: " +imposto);

        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getValidade());
        }
    }
}
