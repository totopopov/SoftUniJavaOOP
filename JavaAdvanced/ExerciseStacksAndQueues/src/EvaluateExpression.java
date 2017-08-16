import jdk.nashorn.internal.ir.IfNode;
import jdk.nashorn.internal.runtime.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Lenovo on 3.2.2017 г..
 */
public class EvaluateExpression {

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


        ArrayDeque<Double> math=new ArrayDeque<>();


        String[] equation=sb.toString().split(" ");

        for (String s : equation) {

          if (!operators.contains(s)){
              math.push(Double.parseDouble(s));
          }else {
              double second=math.pop();
              double first=math.pop();
              switch (s){
                  case "+":
                      math.push(first+second);break;
                  case "-":
                      math.push(first-second);break;
                  case "*":
                      math.push(first*second);break;
                  case "/":
                      math.push(first/second);break;
              }
          }
        }

        System.out.println(String.format("%.2f",math.pop()));

    }

}
