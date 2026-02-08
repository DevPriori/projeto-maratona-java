package academy.devdojo.maratona.introducao.javacore.ZZExercicios.Teste03;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(100);
        System.out.println("qual numero voce acha que é: ");
        int numero = scanner.nextInt();
        int count=0;
        while(numero != n){
            if (numero > n) {
                count++;
                System.out.println("Errou "+count +" vezes,mais para baixo");

            }else {
                count++;
                System.out.println("Errou "+count +" vezes, mais para cima");

            }
            System.out.println("tente novamente");
            numero = scanner.nextInt();
        }
        count++;
        System.out.println("parabens voce acertou o numero correto "+ n + " com "+ count + " tentativas");
        scanner.close();

    }
}
