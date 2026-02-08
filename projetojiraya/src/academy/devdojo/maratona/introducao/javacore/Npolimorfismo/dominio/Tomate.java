package academy.devdojo.maratona.introducao.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{

    public final static  double  VALOR_TAXA =0.1;
    public int validade;

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double cauladoraTaxa() {
        return this.valor * VALOR_TAXA;
    }
}
