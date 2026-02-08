package academy.devdojo.maratona.introducao.javacore.Jmodifcadorfinal.dominio;

public class Carro {
    public static final double  VELOCIDADE_FINAL = 250;
    private String nome;
    public final Comprador COMPRADOR = new Comprador();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
