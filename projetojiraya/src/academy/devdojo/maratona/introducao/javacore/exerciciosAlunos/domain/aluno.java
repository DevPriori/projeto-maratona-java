package academy.devdojo.maratona.introducao.javacore.exerciciosAlunos.domain;

import academy.devdojo.maratona.introducao.javacore.exerciciosAlunos.domain.aluno;

public class aluno {

    String nome;
    int idade;

    public aluno(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }
   public aluno alunos[] = new aluno[5];
    /*


    public void initAlunos() {


        alunos[0] = new aluno("Miguel ", 22);
        alunos[1] = new aluno("andrea ", 20);
        alunos[2] = new aluno("maria ", 19);
        alunos[3] = new aluno("ana ", 23);
        alunos[4] = new aluno("julia ", 17);

    }
    */
    public void dividirMedia(){
        float media;
        int cont = 0;
        for(int i =0; i < alunos.length; i++ ){
            cont = cont + getIdade();
        }
        media = alunos.length;
        System.out.println((float)cont/media);

    }

public void imprimir(){
    System.out.println(nome + idade);
    }

    public void imprime(){
       for (int i = 0;i < alunos.length; i++){
           if(alunos[i] != null){
               alunos[i].imprimir();
           }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
