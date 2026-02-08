package academy.devdojo.maratona.introducao.javacore.URFile.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {

        File fileDiretorio = new File("C:\\Users\\migue\\IdeaProjects\\projetojiraya\\src\\Pasta");
        boolean diretorioCriado = fileDiretorio.mkdir();
        System.out.println("diretorio foi criado? " + diretorioCriado);

        File fileCriado = new File(fileDiretorio, "arquivo.txt");
        boolean arquivoCriado = fileCriado.createNewFile();
        System.out.println("arquivo foi criado? "+ arquivoCriado);

        File fileRenomeado = new File(fileDiretorio , "arquiborenomeadooo");
        boolean renomeaArquivo = fileCriado.renameTo(fileRenomeado);
        System.out.println("arquivo foi renoemado"+ renomeaArquivo);

        File diretoreoRenomeado = new File("C:\\Users\\migue\\IdeaProjects\\projetojiraya\\src\\Pasta2");
        boolean diretorioRenomea = fileDiretorio.renameTo(diretoreoRenomeado);
        System.out.println("diretorio renomeado?" + diretorioRenomea);
    }
}
