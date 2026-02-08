package academy.devdojo.maratona.introducao.javacore.AAAAATESTES.test;

import java.util.Scanner;

public class test01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            //String s1=sc.next();
            int x=sc.nextInt();
            if(x < 100 && x >=10){
                System.out.println("0" + x);
            }else if(x < 10){
                System.out.println("00" + x);
            }
        }
        System.out.println("================================");

    }
}