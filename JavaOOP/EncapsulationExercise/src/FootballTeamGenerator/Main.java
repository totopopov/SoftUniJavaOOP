package FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Todor Popov using Lenovo on 27.2.2017 г. at 19:01.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        HashMap<String,Team> data=new LinkedHashMap<>();

        String command;

        while (!"END".equals(command=reader.readLine())){

            String[] tokens=command.split(";");

            switch (tokens[0]){
                case "Team":

                    CreateTeam(data, tokens[1]);

                    break;

                case"Add":

                    AddPlayer2Team(data, tokens);

                    break;

                case "Remove":

                    RemovePlayer(data, tokens);

                    break;
                case "Rating":
                    calculateRating(data, tokens[1]);
                    break;
            }
        }
    }

    private static void calculateRating(HashMap<String, Team> data, String token) {
        try {

            String team2RateName= token;

            TeamExistCheck(data, team2RateName);

            double rating= data.get(team2RateName).calculateTeamRating();

            System.out.println(String.format("%s - %.0f",team2RateName,rating));
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    private static void RemovePlayer(HashMap<String, Team> data, String[] tokens) {
        try {
            String teamName2Remove=tokens[1];
            String playerName2Remove=tokens[2];
            TeamExistCheck(data, teamName2Remove);

            data.get(teamName2Remove).removePlayer(playerName2Remove);


        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    private static void AddPlayer2Team(HashMap<String, Team> data, String[] tokens) {
        try {

            String teamName2Add=tokens[1];

            TeamExistCheck(data, teamName2Add);

            String playerName=tokens[2];
            int endurance=Integer.parseInt(tokens[3]);
            int sprint=Integer.parseInt(tokens[4]);
            int dribble=Integer.parseInt(tokens[5]);
            int passing=Integer.parseInt(tokens[6]);
            int shooting=Integer.parseInt(tokens[7]);
            Player player=new Player(playerName,endurance,sprint,dribble,passing,shooting);

            data.get(teamName2Add).addPlayer(player);

        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    private static void CreateTeam(HashMap<String, Team> data, String token) {
       try {

           String teamName= token;

           Team team=new Team(token);

           data.putIfAbsent(team.getName(),team);
       } catch (IllegalArgumentException iae){
           System.out.println(iae.getMessage());
       }
    }

    private static void TeamExistCheck(HashMap<String, Team> data, String teamName) {
        if (!data.containsKey(teamName)){
            throw new IllegalArgumentException("Team "+teamName+" does not exist.");
        }
    }

}
