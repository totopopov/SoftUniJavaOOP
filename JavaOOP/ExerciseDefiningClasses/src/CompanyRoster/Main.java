package CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 22.2.2017 г. at 19:47.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,ArrayList<Employee>> dataset = new HashMap<>();

        int lines = Integer.parseInt(reader.readLine());

        for (int i = 0; i < lines; i++) {

            String[] input = reader.readLine().split(" ");

            String name = input[0];
            Double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee = new Employee(name, salary, position, department);

            if (input.length == 6) {
                employee.setEmail(input[4]);
                employee.setAge(Integer.parseInt(input[5]));
            } else if (input.length == 5){
                if (tryParseInt(input[4])) {
                    employee.setAge(Integer.parseInt(input[4]));
                } else {
                    employee.setEmail(input[4]);
                }
            }
            dataset.putIfAbsent(department,new ArrayList<>());
            dataset.get(department).add(employee);
        }


        dataset.entrySet().stream().sorted((e1,e2)->
                Double.compare(e2.getValue().stream().mapToDouble(c->c.getSalary()).sum(),
                        e1.getValue().stream().mapToDouble(c->c.getSalary()).sum())).limit(1).forEach(c->{

                    System.out.println("Highest Average Salary: " + c.getKey());
                    c.getValue().stream().sorted((e1,e2)->e2.getSalary().compareTo(e1.getSalary()))
                            .forEach(e-> System.out.println(e));
                }
                );



    }

    public static boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
