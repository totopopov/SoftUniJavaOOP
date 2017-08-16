import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lenovo on 19.2.2017 г..
 */
public class TheHeiganDance {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int[][] field = new int[15][15];

        Double helganHealthPoints = 3000000d;
        int playerHealthPoints = 18500;
        Double playerDamage = Double.parseDouble(reader.readLine());

        int eruptionDamage = 6000;
        int plagueDamage = 3500;
        boolean hasPlague = false;

        int playerX = 7;
        int playerY = 7;

        String currentMagic = "";

        while (helganHealthPoints > 0 && playerHealthPoints > 0) {

            playerHealthPoints -= hasPlague ? plagueDamage : 0;
            hasPlague=false;
            helganHealthPoints -= playerDamage;

            if (helganHealthPoints <= 0) {
                continue;
            }

            String[] tokens = reader.readLine().split(" ");
            int xcast = Integer.parseInt(tokens[1]);
            int ycast = Integer.parseInt(tokens[2]);
            currentMagic = tokens[0];

            currentMagic=playerHealthPoints<=0?"Cloud":currentMagic;
            if (isInside(playerX, playerY, xcast, ycast)) {

                if (!isInside(playerX - 1, playerY, xcast, ycast) && (playerX - 1 >= 0)) {
                    playerX -= 1;
                } else if (!isInside(playerX, playerY + 1, xcast, ycast) && (playerY + 1 < 15)) {
                    playerY += 1;
                } else if (!isInside(playerX + 1, playerY, xcast, ycast) && (playerX + 1 < 15)) {
                    playerX += 1;
                } else if (!isInside(playerX, playerY - 1, xcast, ycast) && (playerY - 1 >= 0)) {
                    playerY -= 1;
                } else {

                    playerHealthPoints -= "Eruption".equals(tokens[0]) ? eruptionDamage : plagueDamage;
                    hasPlague = "Cloud".equals(tokens[0]) ? true : false;
                }
            }
        }

        currentMagic=currentMagic.equals("Cloud")?"Plague Cloud":"Eruption";
        if (helganHealthPoints <= 0 ) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.println(String.format("Heigan: %.2f", helganHealthPoints));
        }

        if (playerHealthPoints<=0){
            System.out.println("Player: Killed by " + currentMagic);
        }else {
            System.out.println("Player: " + playerHealthPoints);
        }
        System.out.println("Final position: " + playerX + ", " + playerY);
    }

    private static boolean isInside(int playerX, int playerY, int xcast, int ycast) {
        return (Math.abs(xcast - playerX) <= 1) && (Math.abs(ycast - playerY) <= 1);
    }

}
