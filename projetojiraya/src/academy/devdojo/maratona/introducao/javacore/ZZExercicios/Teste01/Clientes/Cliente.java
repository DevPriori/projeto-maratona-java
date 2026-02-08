package academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Clientes;

import academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private List<Cliente> clientes = new ArrayList<>();

    String nome;
    int dinheiro;
    Produto[] produtos;

    public Cliente(String nome, Produto[] produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }




    public void lerProdutos(){
        if(produtos == null)return;

        for (int i = 0;i < produtos.length;i++ ){
            System.out.println("O sistema que o cliente " +getNome()
                               +" precisa é: "+ produtos[i].getName());

        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public Produto[] getProduto() {
        return produtos;
    }

    public void setProduto(Produto[] produto) {
        this.produtos = produto;
    }


}
