package academy.devdojo.maratona.introducao.javacore.FintroducaoModificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeM;
    public static double velocidadeL = 250;

    public Carro(String nome, double velocidadeM) {
        this.nome = nome;
        this.velocidadeM = velocidadeM;
    }

    public static double getVelocidadeL(){

        return velocidadeL;
    }

    public static void setVelocidadeL(double velocidadeL){
        Carro.velocidadeL = velocidadeL;

    }

    public void imprime() {
        System.out.println("==========");
        System.out.println("nome: " + this.nome);
        System.out.println("velocidade maxima: " + this.velocidadeM);
        System.out.println("velocidade limite: " + Carro.velocidadeL);
        System.out.println("==========");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeM() {
        return velocidadeM;
    }

    public void setVelocidadeM(double velocidadeM) {
        this.velocidadeM = velocidadeM;
    }
}

