package academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Test;

import academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio.Aluno01;
import academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio.Sala;

public class EscolaTest02 {
    public static void main(String[] args) {
        Sala sala = new Sala();
        sala.setNid(201);


        Aluno01 aluno1 = new Aluno01("Miguel", 22);
        Aluno01 aluno2 = new Aluno01("Jucelio", 21);
        aluno1.setSala(sala);
        aluno2.setSala(sala);
        Aluno01 [] alunos = {aluno1,aluno2};


        for ( Aluno01 aluno : alunos){
         aluno.imprime();
        }

    }
}
