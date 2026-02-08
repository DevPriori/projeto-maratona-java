package academy.devdojo.maratona.introducao.javacore.KEnum.Dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private String nomeRelatorio;
    private  int valor;

    public static TipoCliente tipoClientePorTipoRelatorio (String nomeRelatorio){
        for (TipoCliente tipoCliente : values()){
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }

        }
        return null;
    }

    TipoCliente(int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }



    public int getValor() {
        return valor;
    }
}
