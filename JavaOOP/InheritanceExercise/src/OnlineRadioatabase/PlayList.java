package OnlineRadioatabase;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 5:05.
 */
public class PlayList {
    private List<Song> playListSongs;

    public PlayList() {
        this.playListSongs = new ArrayList<>();
    }

    public int getSongsNumber(){
        return this.playListSongs.size();
    }

    public void printTimeLenght(){

        int time=0;

        for (Song song : playListSongs) {
            time+=song.getSongSeconds()+song.getSongMinutes()*60;
        }


        int hours=time/(60*60);
        time=time%(60*60);
        System.out.println(String.format("Playlist length: %dh %dm %ds",hours,time/60,time%60));
    }

    public void addSong(String song){

        String[] tokens= Arrays.stream(song.split(";")).map(s->s.trim()).toArray(String[]::new);

        if (tokens.length!=3){
            throw new InvalidSongException();
        }

        String songArtist=tokens[0];
        String songName=tokens[1];

        try {
            Song song1=new Song(songArtist,songName,0,0);
        }catch (InvalidSongException ise){
            System.out.println(ise.getMessage());
            return;
        }

        String[] duration=tokens[2].split(":");

        if (duration.length!=2){
            throw new InvalidSongLengthException();
        }

        int minutes;
        int seconds;

        try {
            minutes=Integer.parseInt(duration[0]);
            seconds=Integer.parseInt(duration[1]);

        } catch (IllegalArgumentException iae){
            throw  new InvalidSongLengthException();
        }

        try {
            Song songToAdd = new Song(songArtist,songName,minutes,seconds);
            this.addSongToList(songToAdd);
            System.out.println("Song added.");
        } catch (InvalidSongException ise){
            System.out.println(ise.getMessage());
        }
    }

    private void addSongToList(Song song){
        this.playListSongs.add(song);
    }



}
