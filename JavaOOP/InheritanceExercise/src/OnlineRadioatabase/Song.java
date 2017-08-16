package OnlineRadioatabase;

/**
 * Created by Todor Popov using Lenovo on 6.3.2017 г. at 4:56.
 */
public class Song {
   private String artistName;
   private String songName;
   private int songMinutes;
   private int songSeconds;


    public Song(String artistName, String songName, int songMinutes, int songSeconds) {
        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setSongMinutes(songMinutes);
        this.setSongSeconds(songSeconds);
    }

    public String getArtistName() {
        return this.artistName;
    }

    private void setArtistName(String artistName) {
        if (artistName.length()<3 || artistName.length()>20){
            throw new InvalidArtistNameException();
        }
        this.artistName = artistName;
    }

    public String getSongName() {
        return this.songName;
    }

    private void setSongName(String songName) {
        if (songName.length()<3 || songName.length()>30){
            throw new InvalidSongNameException();
        }
        this.songName = songName;
    }

    public int getSongMinutes() {
        return this.songMinutes;
    }

    private void setSongMinutes(int songMinutes) {
        if (songMinutes<0 || songMinutes>14){
            throw new InvalidSongMinutesException();
        }
        this.songMinutes = songMinutes;
    }

    public int getSongSeconds() {
        return this.songSeconds;
    }

    private void setSongSeconds(int songSeconds) {
        if (songSeconds<0 || songSeconds>59){
            throw new InvalidSongSecondsException();
        }
        this.songSeconds = songSeconds;
    }
}
