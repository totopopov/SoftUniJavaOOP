import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Problem5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command;
        HashMap<String,Long> players=new LinkedHashMap<>();
        HashMap<String,ArrayList<String>> info=new LinkedHashMap<>();

        while (!"osu!".equals(command=reader.readLine())){

            String[] token=command.split("<->");
            String[] player1=token[0].split(" ");
            String[] player2=token[1].split(" ");
            String player1Name=player1[1];
            String player2Name=player2[0];
            Long player1Damage=Long.parseLong(player1[0]);
            Long player2Damage=Long.parseLong(player2[1]);

            players.putIfAbsent(player1Name,0L);
            players.putIfAbsent(player2Name,0L);

            players.put(player1Name,players.get(player1Name)+player1Damage-player2Damage);
            info.putIfAbsent(player1Name,new ArrayList<>());
            info.get(player1Name).add("*   "+player2Name+" <-> "+(player1Damage-player2Damage));
            players.put(player2Name,players.get(player2Name)+player2Damage-player1Damage);
            info.putIfAbsent(player2Name,new ArrayList<>());
            info.get(player2Name).add("*   "+player1Name+" <-> "+(player2Damage-player1Damage));
        }
        players.entrySet().stream().sorted((k1,k2)->k2.getValue().compareTo(k1.getValue()))
                .forEach(k-> {
                    System.out.println(k.getKey()+" - ("+k.getValue()+")");
                    for (String s : info.get(k.getKey())) {
                        System.out.println(s);
                    }
                });
    }
}
