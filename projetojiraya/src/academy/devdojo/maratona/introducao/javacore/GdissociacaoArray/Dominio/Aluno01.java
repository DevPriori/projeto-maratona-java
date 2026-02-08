package academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio;

public class Aluno01 {

    private String nome;
    private int idade;
    private Sala sala;
    private Aluno01 [] alunos;


    public Aluno01(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Aluno01(String nome, int idade, Aluno01 [] alunos){
        this.nome = nome;
        this.idade = idade;
        this.alunos = alunos;
    }
    public void imprime(){
        System.out.println(this.getIdade());
        System.out.println(this.getNome());
        System.out.println(this.getSala());
        if(this.alunos == null){
            return;
        }
       for (Aluno01 alunos : alunos){
           System.out.println(alunos);
       }
    }

    public void setNome(String nome){

          this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSala(Sala sala){
        this.sala = sala;
    }
    public int getSala(){
        return sala.getNid();
    }


    public int getIdade(){

        return idade;
    }


}
