package academy.devdojo.maratona.introducao.javacore.VPath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String [] args){
        Path p1 = Paths.get("C:\\Users\\migue\\IdeaProjects\\projetojiraya\\src\\Pasta2", "arquiborenomeadooo");

        System.out.println(p1.getFileName());

    }
}
