package academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Test;

import academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio.Escola;
import academy.devdojo.maratona.introducao.javacore.GdissociacaoArray.Dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Cleudão");
        Professor professor2 = new Professor("Seu Eli");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Direto do campo school", 2021, professores);



        escola.imprime();


    }
}
