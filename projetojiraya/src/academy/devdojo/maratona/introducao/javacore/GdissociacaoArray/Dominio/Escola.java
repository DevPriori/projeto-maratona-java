package academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio;

public class Escola {
    private String nome;
    private int idade;
    private Professor [] professores;

    public Escola(String nome, int idade, Professor[] professores){
        this.nome = nome;
        this.idade = idade;
        this.professores = professores;
    }
    public void imprime(){
        System.out.println(nome);
        if(professores == null) return;
        for (Professor professor : professores){
            System.out.println(professor.getNome());
        }


    }

    public String getNome(){
        return this.nome;
    }
    public void setNome( String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
