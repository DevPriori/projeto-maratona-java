package academy.devdojo.maratona.introducao.javacore.PStrings.Test;

public class StringBuildingTest01 {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        timeConcat(30000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo de ST: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        timeConcatSB(30000);
        fim = System.currentTimeMillis();
        System.out.println("tempo de SB: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        timeConcatBFF(30000);
        fim = System.currentTimeMillis();
        System.out.println("tempo de BFF: " + (fim - inicio) + "ms");


    }

    private static void timeConcat(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            String a = "";
            a += i;
        }
    }

    private static void timeConcatSB(int tamanhoSB) {
        StringBuilder sb = new StringBuilder(tamanhoSB);
        for (int i = 0; i < tamanhoSB; i++) {
            sb.append(i);
        }
    }
        private static void timeConcatBFF(int tamanhoBFF) {
            StringBuffer bf = new StringBuffer(tamanhoBFF);
            for (int i = 0; i < tamanhoBFF; i++) {
                bf.append(i);
            }
        }

}

