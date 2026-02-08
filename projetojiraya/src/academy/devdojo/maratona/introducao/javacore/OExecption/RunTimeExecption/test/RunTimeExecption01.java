package academy.devdojo.maratona.introducao.javacore.OExecption.RunTimeExecption.test;

import java.util.ArrayList;

public class RunTimeExecption01 {
    public static void main(String[] args) {
        //Unchecked <<- runtime
        //Checked nem compila

        int [] nums = {1,2};

        System.out.println(nums[2]);
    }
}
