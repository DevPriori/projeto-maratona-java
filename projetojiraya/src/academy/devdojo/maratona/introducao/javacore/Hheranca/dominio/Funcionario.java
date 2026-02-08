package academy.devdojo.maratona.introducao.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private int salario;

    public Funcionario(String pessoa){
        super(pessoa);
    }


    public void imprime(){
        super.imprime();
        System.out.println(salario);
    }


    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
