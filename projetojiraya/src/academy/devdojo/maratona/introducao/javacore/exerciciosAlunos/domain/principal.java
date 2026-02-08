package academy.devdojo.maratona.introducao.javacore.exerciciosAlunos.domain;


import academy.devdojo.maratona.introducao.javacore.GExercicio.dominio.test.Aluno;

public class principal {
    public static void main(String[] args) {
        float media;
        int cont = 0;
        aluno alunos[] = new aluno[5];

        media = alunos.length;

        alunos[0] = new aluno("Miguel ", 18);
        alunos[1] = new aluno("andrea ", 20);
        alunos[2] = new aluno("maria ", 25);
        alunos[3] = new aluno("ana ", 23);
        alunos[4] = new aluno("julia ", 57);

            for(int i =0; i < alunos.length; i++ ){
                cont = cont + alunos[i].getIdade();
        }

            for(int i = 0; i < alunos.length; i++){
                alunos[i].imprimir();
            }
        System.out.println("sua me dia é " + (float)cont/media);


    }
}
