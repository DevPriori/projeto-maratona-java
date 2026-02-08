package academy.devdojo.maratona.introducao.javacore.URFile.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String [] args){

        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
        fw.write("mlk é zicaaa, golll do ney \n ihuuullll");
        fw.write("mlk é zicaaa, golll do ney \n ihuuullll");

        fw.flush();


        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }
}
