package academy.devdojo.maratona.introducao.javacore.OExecption.Execption.test;

import java.io.File;
import java.io.IOException;

public class ExecptionTest01 {
    public static void main(String[] args) {

        criarArquivo("Desqxter.txt");
    }

    public static void criarArquivo(String nomeArquivo){
        File file = new File("Arquivos\\"+nomeArquivo);
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Criado");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
