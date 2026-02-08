package academy.devdojo.maratona.introducao.javacore.Jmodifcadorfinal.test;

import academy.devdojo.maratona.introducao.javacore.Jmodifcadorfinal.dominio.Carro;
import academy.devdojo.maratona.introducao.javacore.Jmodifcadorfinal.dominio.Comprador;

public class Test01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();
        System.out.println(Carro.VELOCIDADE_FINAL);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Goku");
        System.out.println(carro.COMPRADOR);
    }
}
