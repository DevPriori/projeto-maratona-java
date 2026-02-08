package academy.devdojo.maratona.introducao.javacore.URFile.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadeTest01 {
    public static void main(String [] args){

       File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)) {
            int i;
            while((i=fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
