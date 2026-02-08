package academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio;

public  class Computador extends Produto{

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    public final static  double  VALOR_TAXA =0.21;

    @Override
    public double cauladoraTaxa() {
        return this.valor * VALOR_TAXA;
    }
}
