package Тelephony;

/**
 * Created by Todor Popov using Lenovo on 15.3.2017 г. at 19:28.
 */
public class SmartPhone implements Callable,BrowseAble {

    @Override
    public String callOtherPhones(String phoneNumber) {
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))){
                return "Invalid number!";
            }
        }
        return "Calling... "+ phoneNumber;
    }

    @Override
    public String browseWebSites(String URLString) {
        for (int i = 0; i < URLString.length(); i++) {
            if (Character.isDigit(URLString.charAt(i))){
                return "Invalid URL!";
            }
        }
        return "Browsing: "+URLString+"!";
    }
}
