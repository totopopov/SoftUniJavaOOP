import java.util.*;

/**
 * Created by Lenovo on 24.1.2017 г..
 */
public class SoftUniPartyWith2Hash {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> numbers= new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9" ));

        HashSet<String> regular = new HashSet<>();

        TreeSet<String> vips = new TreeSet<>();

        String input ="";

        while (!("PARTY").equals(input=sc.nextLine())){

            if (numbers.contains(input.charAt(0))){
                vips.add(input);
            }else {
                regular.add(input);
            }
        }

        while (!("END").equals(input=sc.nextLine())){

            if (numbers.contains(input.charAt(0))){
                vips.remove(input);
            }else {
                regular.remove(input);
            }
        }

        vips.addAll(regular);

        System.out.println(vips.size());

        for (String vip : vips) {
            System.out.println(vip);
        }
    }
}
