package academy.devdojo.maratona.introducao.LeetCodeMaster;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesesReal {
    public static void main(String[] args) {
        System.out.println(isValid("{{"));


    }

    public static boolean isValid(String s){

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++ ){

            char c = s.charAt(i);
            if(c == '{' || c == '[' || c== '('){
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;

                char topo = stack.pop();

                if(c == '}' && topo != '{' ) return false;
                if(c == ']' && topo != '[' ) return false;
                if(c == ')' && topo != '(' ) return false;

            }


        }
        return stack.isEmpty();
    }
}
