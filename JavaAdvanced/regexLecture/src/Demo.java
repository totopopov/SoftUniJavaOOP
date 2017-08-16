import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 2.2.2017 г..
 */
public class Demo {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("a");

        Matcher matcher = pattern.matcher("aaaab");

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }

}
