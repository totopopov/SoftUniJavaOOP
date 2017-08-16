import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Lenovo on 11.2.2017 г..
 */
public class LittleJohn {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> data = new LinkedHashMap<>();

        String small = "s";
        String medium = "m";
        String large = "l";
        String split = "[^>\\-]+";

        data.put(small, 0);
        data.put(medium, 0);
        data.put(large, 0);

        String line;

        for (int i = 0; i < 4; i++) {
            line = reader.readLine();

//            String[] tokens= line.split(split);
//            for (String token : tokens) {
//
//                if (token.equals(">>>----->>")){
//                    data.put(large, data.get(large) + 1);
//                }
//                if (token.equals(">>----->")){
//                    data.put(medium, data.get(medium) + 1);
//                }
//                if (token.equals(">----->")){
//                    data.put(small, data.get(small) + 1);
//                }
//        }

            while (line.indexOf(">>>----->>") != -1) {
                data.put(large, data.get(large) + 1);
                line = line.replaceFirst(">>>----->>", "9");
            }
            while (line.indexOf(">>----->") != -1) {
                data.put(medium, data.get(medium) + 1);
                line = line.replaceFirst(">>----->", "9");
            }

            while (line.indexOf(">----->") != -1) {
                data.put(small, data.get(small) + 1);
                line = line.replaceFirst(">----->", "9");
            }

        }


        Integer code = Integer.parseInt(data.get(small).toString() + data.get(medium).toString() + data.get(large).toString());
        StringBuilder bin = new StringBuilder(Integer.toBinaryString(code));
        String out = bin.toString() + bin.reverse().toString();
        System.out.println(Integer.parseInt(out, 2));
    }
}
