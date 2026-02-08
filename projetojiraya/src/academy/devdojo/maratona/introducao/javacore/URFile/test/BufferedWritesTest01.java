package academy.devdojo.maratona.introducao.javacore.URFile.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritesTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fw)) {
            br.write("miguel");
            br.newLine();
            br.write("badyclair");

            br.flush();


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
