import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        Player newPlayer1 = new Player("Dawid",30,"Keeper",25);
        Player newPlayer2 = new Player("Tabraiz",21,"spin baller",15);
        Player newPlayer3 = new Player("Shane",27,"spin baller",50);
        Player newPlayer4 = new Player("Watson",31,"batsman",35;

        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(newPlayer1);
        playerList.add(newPlayer2);
        playerList.add(newPlayer3);
        playerList.add(newPlayer4);

        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please Select an Option : A");
            System.out.println( "Add a Player : B") ;
            System.out.println("Display two best batsman :C");
            System.out.println("Display two best keepers :D");
            System.out.println("View all players:E");
            String get = scanner1.nextLine();

            switch (get){
                case "A":
                    break;
                case "B":
                    break;
                case "C":
                    break;
                case "D":
                    break;
                case "E":
                    break
            }
        }

    }
