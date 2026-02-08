package academy.devdojo.maratona.introducao.javacore.KEnum.Dominio;

public class Cliente {


    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }
    @Override
    public String toString(){
        return "Cliente name:" + nome+ " " + "Tipo do cliente: " + tipoCliente.getNomeRelatorio() + "  Tipo valor cliente: "
                + tipoCliente.getValor() + "  tipo pagamento " + tipoPagamento;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


}
