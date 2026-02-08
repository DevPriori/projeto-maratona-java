package academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste02;

public class Funcionario {
    int id;
    String name;
    String setor;

    public Funcionario() {

    }

    @Override
    public String toString() {
        return " \n name: " + name +" setor: "+ setor+" ID: "+ id;
    }

    public Funcionario(int id, String name, String setor) {
        this.id = id;
        this.name = name;
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
