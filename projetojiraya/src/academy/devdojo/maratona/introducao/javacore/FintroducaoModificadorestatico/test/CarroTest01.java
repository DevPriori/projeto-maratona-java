package academy.devdojo.maratona.introducao.javacore.FintroducaoModificadorestatico.test;

import academy.devdojo.maratona.introducao.javacore.FintroducaoModificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

       Carro.setVelocidadeL(20);

       Carro c1 = new Carro("fusca", 500);
       Carro c2 = new Carro("aviao", 300);
       Carro c3 = new Carro("aviao", 300);

       c1.imprime();
       c2.imprime();
       Carro.velocidadeL = 1 ;
       c3.imprime();
    }
}
