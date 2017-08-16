package leson1;

/**
 * Created by Todor Popov using Lenovo on 20.7.2017 г. at 19:12.
 */
public class Regex {
    public static void main(String[] args) {

        String pas= "paS12?";

        pas.replaceFirst("[a-z]","");

        System.out.println(pas.matches("^(?=.*[a-z])"));


    }
}
