import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 8.2.2017 г..
 */
public class ListOfPredicates {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        LinkedHashSet<Integer> list= Arrays.stream(reader.readLine().
                split(" ")).map(e->Integer.parseInt(e)).collect(Collectors.toCollection(LinkedHashSet::new));

        Predicate<Integer> checkForDeletion=e-> {
            boolean divide=true;
            for (Integer integer : list) {
              if (e%integer!=0){
                  divide=false;
              }
            }
          return divide;};

        for (int i = 1; i <= number; i++) {
            if (checkForDeletion.test(i)){
                System.out.print(i + " ");
            }
        }

    }


}
