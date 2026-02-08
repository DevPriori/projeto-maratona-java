package academy.devdojo.maratona.introducao.javacore.GExercicio.test;

import academy.devdojo.maratona.introducao.javacore.GExercicio.dominio.test.Aluno;
import academy.devdojo.maratona.introducao.javacore.GExercicio.dominio.test.Local;
import academy.devdojo.maratona.introducao.javacore.GExercicio.dominio.test.Professor;
import academy.devdojo.maratona.introducao.javacore.GExercicio.dominio.test.Seminario;

public class Test01 {
    public static void main(String[] args) {
        Local local = new Local("Terra");
        Aluno aluno = new Aluno("Miguel", 22);
        Aluno [] alunos = {aluno};
        Seminario seminario = new Seminario("Como ganha grana",alunos ,local);
        Seminario [] seminarios = {seminario};
        Professor professor = new Professor("Daniel", "sociologia", seminarios);

        professor.setSeminarios(seminarios);



        professor.imprime();
    }
}
