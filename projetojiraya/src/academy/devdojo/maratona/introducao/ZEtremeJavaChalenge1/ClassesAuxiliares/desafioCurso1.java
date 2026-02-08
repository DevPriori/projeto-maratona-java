package academy.devdojo.maratona.introducao.ZEtremeJavaChalenge1.ClassesAuxiliares;

public class desafioCurso1 {
    public static void main(String[] args) {

      getEvenDigitSum(6688);

    }
    public static int getEvenDigitSum(int number){
        if(number < 0) return -1;
        String arrayStr = Integer.toString(number);
        int [] newArray = new int [arrayStr.length()];

        for(int i = 0; i < newArray.length; i++){

            newArray[i] = arrayStr.charAt(i)-'0';
        }
        int count = 0;
        for(int i = 0; i < newArray.length; i++){
            if(newArray[i]%2 == 0){
                count = count + newArray[i];
            }

        }
        return count;

    }
}


