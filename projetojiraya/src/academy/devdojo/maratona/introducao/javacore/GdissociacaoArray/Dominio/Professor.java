package academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio;

public class Professor {

    private String nome;

    public Professor(String nome){
        this.nome = nome;
    }
    public String getNome(){
       return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
