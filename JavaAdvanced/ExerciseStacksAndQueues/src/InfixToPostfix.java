import jdk.nashorn.internal.runtime.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Created by Lenovo on 3.2.2017 г..
 */
public class InfixToPostfix {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input=reader.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        HashSet<String>operators= new HashSet<>();
        operators.add("+");
        operators.add("/");
        operators.add("*");
        operators.add("-");

        ArrayDeque<String> operator = new ArrayDeque<>();

        for (String s : input) {
            if (operators.contains(s)){

                if (s.equals("max")){
                    IOException e = new IOException();
                    throw e;
                }

                if (!operator.isEmpty() &&(s.equals("/") || s.equals("*") ) && (operator.peek().equals("*") || operator.peek().equals("/")) ){
                    sb.append(operator.pop()).append(" ");
                    operator.push(s);
                } else if (!operator.isEmpty() &&(s.equals("+") || s.equals("-") ) && (operator.peek().equals("+") || operator.peek().equals("-") || operator.peek().equals("*") || operator.peek().equals("/")) ){
                    sb.append(operator.pop()).append(" ");
                    operator.push(s);
                } else {
                    operator.push(s);
                }
            }else if ( s.equals("(") ){
                operator.push(s);
            } else if (s.equals(")")){
                while (!operator.peek().equals("(")){
                    sb.append(operator.pop()).append(" ");
                }
                operator.pop();
            } else {
                sb.append(s).append(" ");
            }


        }

        while (!operator.isEmpty()){
            sb.append(operator.pop()).append(" ");
        }

        System.out.println(sb.toString().trim());

    }

}
