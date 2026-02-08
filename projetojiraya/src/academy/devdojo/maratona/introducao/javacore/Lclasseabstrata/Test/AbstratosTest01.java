package academy.devdojo.maratona.introducao.javacore.Lclasseabstrata.Test;

import academy.devdojo.maratona.introducao.javacore.Lclasseabstrata.dominio.Desenvolvedor;
import academy.devdojo.maratona.introducao.javacore.Lclasseabstrata.dominio.Gerente;

public class AbstratosTest01 {
    public static void main(String[] args) {

        Desenvolvedor dev1 = new Desenvolvedor("Miguel", 10000f);
        Gerente gerente = new Gerente("Nane", 6000);
        System.out.println(dev1);
        System.out.println(gerente);

    }
}
