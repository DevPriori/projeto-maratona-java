package academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio.Funcionario01;
import academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio.ImprimeFuncionario;
import academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio.MediaFuncionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario01 f1 = new Funcionario01();

        Funcionario01 f2 = new Funcionario01();

        Funcionario01 f3 = new Funcionario01();

        ImprimeFuncionario imprime = new ImprimeFuncionario();
        MediaFuncionario media = new MediaFuncionario();

        f1.nome = "Miguel";
        f1.idade = 21;
        f1.salario = 2500f;

        f2.nome = "Andrea";
        f2.idade = 22;
        f2.salario = 21200f;

        f3.nome = "Eduardo";
        f3.idade = 60;
        f3.salario = 5000f;

        imprime.imprimeFuncionario(f1);
        imprime.imprimeFuncionario(f2);
        imprime.imprimeFuncionario(f3);

        media.imprimeMedia( f1.salario, f2.salario, f3.salario);

    }
}
