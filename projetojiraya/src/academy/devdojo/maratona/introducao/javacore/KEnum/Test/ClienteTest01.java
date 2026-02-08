package academy.devdojo.maratona.introducao.javacore.KEnum.Test;

import academy.devdojo.maratona.introducao.javacore.KEnum.Dominio.Cliente;
import academy.devdojo.maratona.introducao.javacore.KEnum.Dominio.TipoCliente;
import academy.devdojo.maratona.introducao.javacore.KEnum.Dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Miguel", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Miguel", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        System.out.println(cliente2);
        System.out.println(cliente1);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

      TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
      System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorTipoRelatorio("Pessoa fisica");
        System.out.println(tipoCliente1);

    }
}
