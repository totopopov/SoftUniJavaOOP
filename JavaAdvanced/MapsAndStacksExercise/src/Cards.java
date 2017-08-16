import java.util.*;

/**
 * Created by pc on 25.1.2017 г..
 */
public class Cards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, HashSet<String>> data = new LinkedHashMap<>();

        String[] input = sc.nextLine().split(":");

        while (!("JOKER").equals(input[0])) {
            String[] cards = input[1].split(", ");

            if (data.containsKey(input[0])) {
                for (int i = 0; i < cards.length; i++) {
                    data.get(input[0]).add(cards[i].trim());
                }

            } else {
                HashSet<String> putingIn = new HashSet<>();
                for (int i = 0; i < cards.length; i++) {
                    putingIn.add(cards[i].trim());
                }
                data.put(input[0], putingIn);
            }
            input = sc.nextLine().split(":");
        }

        for (Map.Entry<String, HashSet<String>> entry : data.entrySet()) {

            int value = 0;

            for (String s : entry.getValue()) {

                char power = s.toCharArray()[s.length() - 1];
                int currentValue = 0;
                switch (power) {
                    case 'S':
                        currentValue = 4;
                        break;
                    case 'H':
                        currentValue = 3;
                        break;
                    case 'D':
                        currentValue = 2;
                        break;
                    case 'C':
                        currentValue = 1;
                        break;
                }
                if (s.length() == 3) {
                    currentValue = currentValue * 10;
                } else {
                    char card =s.charAt(0) ;
                    if (card >= '2' && card<='9'){
                        currentValue=currentValue*((int)card-48);
                    }else {
                        switch (card){
                            case 'J': currentValue=currentValue*11;
                                break;
                            case 'Q': currentValue=currentValue*12;
                                break;
                            case 'K': currentValue=currentValue*13;
                                break;
                            case 'A': currentValue=currentValue*14;
                                break;
                        }
                    }
                }

                value+=currentValue;
            }

            System.out.println(entry.getKey()+": "+value);

        }
    }
}
