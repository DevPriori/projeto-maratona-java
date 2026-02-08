package academy.devdojo.maratona.introducao.javacore.URFile.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try{
            boolean isCreated = file.createNewFile();
            System.out.println("existe " + isCreated);
            System.out.println("caminho "+file.getAbsoluteFile());
            System.out.println("é um arquivo "+file.isFile());
            System.out.println("pode ler "+file.canRead());
            System.out.println("esta escondido "+file.isHidden());
            System.out.println("e um diretorio "+file.isDirectory());
            System.out.println(file.exists());
            if(file.exists()){
                System.out.println("deletado " + file.delete());
            }


        } catch(IOException exception){

            exception.printStackTrace();
        }

    }

}
