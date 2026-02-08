package academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio.Carro;

public class Carro01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 2005;
        carro1.modelo = "Bugatti";
        carro1.valor = 145.000f;
        carro1.imprimeCarro();
        
        carro2.ano = 2025;
        carro2.modelo = "Bugatti 19000";
        carro2.valor = 22335.000f;
        carro2.imprimeCarro();
    }
}
