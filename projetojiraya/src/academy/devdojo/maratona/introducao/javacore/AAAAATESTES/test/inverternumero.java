package academy.devdojo.maratona.introducao.javacore.AAAAATESTES.test;

public class inverternumero {
    public static void main(String[] args) {

        int num = 123;
        int inv = 0;
        while(num > 0){
            inv = inv * 10 + (num % 10);
            num /= 10;
        }
        System.out.println(inv);

    }
}
