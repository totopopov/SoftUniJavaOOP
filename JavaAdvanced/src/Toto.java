/**
 * Created by Lenovo on 17.1.2017 г..
 */
public class Toto {

    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                for (int k = 1; k <=10 ; k++) {
                    if (i!=j && i!=k && j!=k){
                        System.out.println(i + " " + j + " "+k );
                    }
                }
            }
        }
    }
}
