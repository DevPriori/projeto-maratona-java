package academy.devdojo.maratona.introducao.ZEtremeJavaChalenge1;

public class Chalenge1a4 {
    public static void main(String[] args) {


        printNumberInWorld(5);




    }
    public static void printNumberInWorld(int num){
        String [] numbers = {"ZERO","ONE","TWO","TREE","FOUR","FIVE","SIX","SEVEN","EIGTH","NINE"};
        String last = "OTHER";

        if(num > 9 || num < 0){
            System.out.print(last);
        }else{
            System.out.print(numbers[num]);
        }
    }
}
