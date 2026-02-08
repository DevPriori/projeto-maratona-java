package academy.devdojo.maratona.introducao.javacore.U2Regex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "migue,mae,pai,1,2,10,true";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
       

        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                int i =  scanner.nextInt();
                System.out.println("int = "+i);
            }

             else if (scanner.hasNextBoolean()){
                 boolean b = scanner.nextBoolean();
                System.out.println("bollean = "+b);
            }
             else {
                System.out.println(scanner.next());
            }

        }
    }
}
