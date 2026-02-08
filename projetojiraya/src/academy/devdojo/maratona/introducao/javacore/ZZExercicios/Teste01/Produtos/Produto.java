package academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Produtos;

import academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste01.Funcionario.Funcionario;

public class Produto {

    String name;
    int entrega;
    Funcionario funcionarios[];

    public Produto(String name, int validade) {
        this.name = name;
        this.entrega = validade;
    }

    @Override
    public String toString() {
        return "Produto: "+name +" entrega: " + entrega;
    }

    public Produto(String name, int validade, Funcionario[] funcionario) {
        this.name = name;
        this.entrega = validade;
        this.funcionarios = funcionario;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValidade() {
        return entrega;
    }

    public void setValidade(int validade) {
        this.entrega = validade;
    }

    public Funcionario[] getFuncionario() {
        return funcionarios;
    }

    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionarios = funcionario;
    }
}
