package academy.devdojo.maratona.introducao.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(int x ,int y){
        System.out.println(x + y);
    }

    public void subtraiDoisNumeros(int x, int y){
        System.out.println(x - y);
    }

    public double dividaDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }

        return num1/num2;
    }

    public void imprimeDoisNumeros(int numero1, int numero2){
        numero2 = 33;
        numero1 = 99;

        System.out.println("Numero1= " + numero1);
        System.out.println("Numero2= " + numero2);

    }
}
