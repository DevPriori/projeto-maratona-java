package academy.devdojo.maratona.introducao.javacore.VPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\migue\\IdeaProjects\\projetojiraya\\src\\Pasta2\\teste.txt");
        if(Files.notExists(path)){
            Path diretorio = Files.createDirectory(path);
        }
        Path subPasta = Paths.get("C:\\Users\\migue\\IdeaProjects\\projetojiraya\\src\\Pasta");
        Path subDirectory = Files.createDirectories(subPasta);
        Path file = Paths.get(subPasta.toString(), "arquivo2.txt");

        if(Files.notExists(file)){
            Path criandoArrquivo = Files.createFile(file);
        }

        Path origem = file;
        Path alvo = Paths.get(file.getParent().toString(), "arquivoRenomeado.txt");
        Files.copy(origem, alvo, StandardCopyOption.REPLACE_EXISTING);

    }
}
