package academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio;

import academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.test.FuncionarioTest01;

public class MediaFuncionario {
  public void  imprimeMedia(double salario1, double salario2, double salario3){
      double media = (salario1 + salario2 + salario3) / 3;
    System.out.println("Sua media é de: " + media);
    }

}
