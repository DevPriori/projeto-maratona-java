package academy.devdojo.maratona.introducao.ZEIJAVAChalengers;

public class desafio1 {
    public static void main(String[] args) {
        int divisor = 3;
        int dividend = 10;
        if(divisor > 0){
            while(divisor < dividend){
                dividend -= divisor;
            }
        }
        System.out.println(dividend);

    }
}

