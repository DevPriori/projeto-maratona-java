package academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Funcionario;

import academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Produtos.Produto;

import java.util.Arrays;

public class Funcionario {
    float salario;
    String nome;
    Produto produtos[];
    int id;

    public Funcionario(String nome, Produto produtos, int id) {
        this.nome = nome;
        this.produtos = new Produto[]{produtos};
        this.id = id;
    }

    @Override
    public String toString() {
        return "Funcionario: "+ nome +" produtos: " + Arrays.toString(produtos) +
                " id=" + id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public int getIdade() {
        return id;
    }

    public void setIdade(int idade) {
        this.id = id;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
