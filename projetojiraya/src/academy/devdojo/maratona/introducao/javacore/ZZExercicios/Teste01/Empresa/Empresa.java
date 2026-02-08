package academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Empresa;

import academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Clientes.Cliente;
import academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Funcionario.Funcionario;
import academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Produtos.Produto;

import java.util.ArrayList;

public class Empresa {

    float capital;
    Produto produtos[];
    Cliente clientes[];
    Funcionario funcionarios[];

    public Empresa(Produto[] produtos, Funcionario[] funcionarios) {
        this.produtos = produtos;
        this.funcionarios = funcionarios;
    }

    public Empresa(Produto [] produtos, Cliente[] clientes, Funcionario[] funcionarios) {
        this.produtos = produtos;
        this.clientes = clientes;
        this.funcionarios = funcionarios;
    }
    public void adicionarCLientes(Cliente[] clientes, Cliente cliente){
        ArrayList<Cliente>clientes1 = new ArrayList<>();
        for (Cliente clientes2: clientes){
            clientes1.add(cliente);
        }

        System.out.println("CLiente adicionado");
    }



    public void quadroFuncionarios(){
        if(funcionarios == null) return;
        for(int i = 0; i < funcionarios.length; i++){
            System.out.println("O funcionario: "+funcionarios[i].getNome()
                    + " do id "+ funcionarios[i].getId()+ " do projeto: "+produtos[i].getName());
        }
    }

        public void lerProdutos(){
            if(produtos == null)return;

            for (int i = 0;i < produtos.length;i++ ){
                System.out.println(produtos[i].getName());

            }
        }

    public void todosClientes(){
        if(clientes == null)return;

        for(int i = 0; i <clientes.length; i++){
            System.out.println(clientes[i].getNome());

        }
    }



    public void contratar(){

    }



    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
