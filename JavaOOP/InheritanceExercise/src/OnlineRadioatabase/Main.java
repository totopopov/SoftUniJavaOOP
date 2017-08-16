package OnlineRadioatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 4:41.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int lines = Integer.parseInt(reader.readLine());

        PlayList playList=new PlayList();

        for (int i = 0; i < lines; i++) {

            try {
                String input=reader.readLine().trim();
                playList.addSong(input);
            } catch (InvalidSongException ise){
                System.out.println(ise.getMessage());
            }

        }

        System.out.println(String.format("Songs added: %d",playList.getSongsNumber()));
        playList.printTimeLenght();

    }
}
