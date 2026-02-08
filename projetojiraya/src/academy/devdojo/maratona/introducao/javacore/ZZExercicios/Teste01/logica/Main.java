package academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.logica;

import academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Clientes.Cliente;
import academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Funcionario.Funcionario;
import academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Produtos.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produto [] produtos = new Produto[3];
        Funcionario [] funcionarios = new Funcionario[3];
        Cliente []clientes = new Cliente[3];

        ArrayList<Cliente>clientesList = new ArrayList<>();
        for(Cliente cliente: clientes){
            clientesList.add(cliente);
        }




        clientes[0] = new Cliente("RH.ltda", new Produto[]{produtos[0]});
        produtos[0] = new Produto("SistemaRH", 5);
        funcionarios[0] = new Funcionario("Miguel", produtos[0], 9 );



    }
}
