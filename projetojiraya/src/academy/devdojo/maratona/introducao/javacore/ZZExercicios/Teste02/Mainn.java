package academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste02;

import java.util.ArrayList;

public class Mainn {

    public static void main(String[] args) {
       Empresa R2DA = new Empresa("R2DA",1000000);
       R2DA.funcionarios.add(new Funcionario(1,"jão", "DEV"));
       R2DA.funcionarios.add(new Funcionario(3,"avelino", "DEV"));
       R2DA.funcionarios.add(new Funcionario(5,"rita", "RH"));

       R2DA.bancoDeTalentos1.add(new bancoDeTalentos("Miguel", "MegaDEV"));

       Funcionario demitido = R2DA.funcionarios.get(0);
       bancoDeTalentos contratado = R2DA.bancoDeTalentos1.get(0);

       R2DA.imprimir();

       R2DA.contratar(contratado);
       R2DA.demitir(demitido);
      R2DA.alterar(5, "márcia", "DEV");


       R2DA.imprimir();
    }
}
