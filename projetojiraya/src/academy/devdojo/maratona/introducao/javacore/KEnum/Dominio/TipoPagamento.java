package academy.devdojo.maratona.introducao.javacore.KEnum.Dominio;

public enum TipoPagamento{
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.03;
        }
    },CREDITO{
        @Override
        public double calcularDesconto(double valor){
            return valor * 0.1;
        }

    };

    public abstract double calcularDesconto(double valor);


    }