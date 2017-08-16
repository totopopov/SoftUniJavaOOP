package FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Todor Popov using Lenovo on 27.2.2017 г. at 19:24.
 */
public class Team extends Name{

   private List<Player> players;

    public Team(String name) {
        super(name);
        this.setPlayers(new ArrayList<>());
    }

    private List<Player> getPlayers() {
        return players;
    }

    private void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player){
        this.getPlayers().add(player);
    }

    public void removePlayer(String player2Remove){

        Player[] players2BERemoveD= this.getPlayers().stream().filter(p -> p.getName().equals(player2Remove)).toArray(Player[]::new);

        if (players2BERemoveD.length==0){
            throw new IllegalArgumentException("Player "+ player2Remove+ " is not in "+this.getName()+" team.");
        }

        for (Player player : players2BERemoveD) {
            this.getPlayers().remove(player);
        }

    }

    public double calculateTeamRating(){
      return this.getPlayers().stream().mapToDouble(player->player.calculateAverageStats()).average().orElse(0d);
    }

}
