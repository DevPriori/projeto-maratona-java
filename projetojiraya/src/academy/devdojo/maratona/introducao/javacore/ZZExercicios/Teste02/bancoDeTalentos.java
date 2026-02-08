package academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste02;

public class bancoDeTalentos extends Funcionario {

    String name;
    String setor;

    @Override
    public String toString() {
        return "\n name: " + name +"setor: "+ setor;
    }

    public bancoDeTalentos(String nome, String setor) {
        super();
        this.name = nome;
        this.setor = setor;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
