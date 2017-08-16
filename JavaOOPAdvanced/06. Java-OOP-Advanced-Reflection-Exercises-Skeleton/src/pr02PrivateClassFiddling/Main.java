package pr02PrivateClassFiddling;

import pr02PrivateClassFiddling.com.peshoslav.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args)
            throws NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException,
            NoSuchFieldException,
            IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class<BlackBoxInt> blackBoxIntClass = BlackBoxInt.class;

        Constructor<?>[] declaredConstructors = blackBoxIntClass.getDeclaredConstructors();

        Constructor<BlackBoxInt> constructor = blackBoxIntClass.getDeclaredConstructor();
        constructor.setAccessible(true);



        BlackBoxInt blackBoxInt= constructor.newInstance();
        Field field=blackBoxIntClass.getDeclaredField("innerValue");
        field.setAccessible(true);

        String input;

        while (!"END".equals(input=reader.readLine())){
            String[] tokens = input.split("_");
            switch (tokens[0]){
                case"add":
                    Method methodAdd=blackBoxIntClass.getDeclaredMethod("add",int.class);
                    methodAdd.setAccessible(true);
                    methodAdd.invoke(blackBoxInt,Integer.parseInt(tokens[1]));
                    break;
                case "subtract":
                    Method methodSubtract=blackBoxIntClass.getDeclaredMethod("subtract",int.class);
                    methodSubtract.setAccessible(true);
                    methodSubtract.invoke(blackBoxInt,Integer.parseInt(tokens[1]));
                    break;
                case "multiply":
                    Method methodMultiply=blackBoxIntClass.getDeclaredMethod("multiply",int.class);
                    methodMultiply.setAccessible(true);
                    methodMultiply.invoke(blackBoxInt,Integer.parseInt(tokens[1]));
                    break;
                case "divide":
                    Method methodDivide=blackBoxIntClass.getDeclaredMethod("divide",int.class);
                    methodDivide.setAccessible(true);
                    methodDivide.invoke(blackBoxInt,Integer.parseInt(tokens[1]));
                    break;
                case "leftShift":
                    Method methodLeftShift=blackBoxIntClass.getDeclaredMethod("leftShift",int.class);
                    methodLeftShift.setAccessible(true);
                    methodLeftShift.invoke(blackBoxInt,Integer.parseInt(tokens[1]));
                    break;
                case "rightShift":
                    Method methodRightShift=blackBoxIntClass.getDeclaredMethod("rightShift",int.class);
                    methodRightShift.setAccessible(true);
                    methodRightShift.invoke(blackBoxInt,Integer.parseInt(tokens[1]));
                    break;
            }
            System.out.println(field.get(blackBoxInt));;
        }

    }
}
