import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Todor Popov using Lenovo on 10.4.2017 г. at 23:00.
 */
public class GeneratePasswordList {

        private final static String projectPath=System.getProperty("user.dir")+"/src/resources/";
        private final static String file3Path=projectPath+"wpa.txt";
        private final static String[] SYMBOLS= new String[]{"A","B","C"};

    public static void main(String[] args) throws FileNotFoundException {

        try (PrintWriter print=new PrintWriter(file3Path)){

            List<String> symbols= new ArrayList<>();


            for (int i = 48; i < 58; i++) {
                symbols.add(String.valueOf((char)(i)));
            }


            String[] s = symbols.toArray(new String[symbols.size()]);

            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s.length; j++) {
                    for (int k = 0; k < s.length; k++) {
                        for (int l = 0; l < s.length; l++) {
                            for (int m = 0; m < s.length; m++) {
                                for (int n = 0; n < s.length; n++) {
                                    for (int o = 0; o < s.length; o++) {
                                        for (int p = 0; p < s.length; p++) {
                                            String line=s[i]+s[j]+s[k]+s[l]+s[m]+s[n]+s[o]+s[p];
                                            print.println(line);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }


            print.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
