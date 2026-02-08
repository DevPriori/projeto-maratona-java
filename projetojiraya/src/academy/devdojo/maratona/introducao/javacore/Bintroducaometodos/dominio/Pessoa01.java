package academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio;

public class Pessoa01 {
    int idade;
    String nome;

    public void imprime(){
        System.out.println(this.idade);
        System.out.println(this.nome);
    }

    public void setIdade(int idade){
        if(idade < 0 ){
            System.out.println("Idade invalida");
            return;
        }
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getNome(){

        return nome;
    }
}
