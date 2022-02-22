/*
 * Name: Justin Houle
 * Date: 2022/02/22
 * Description: The main class used to test the "Player" and "Team" classes.
 */

/**
 * Lab 5: Midterm review with iterators
 */
package Lab05;

/**
 * Main class used to test the "Player" and "Team" classes
 */
public class Main {
    /**
     * @param arg command line arguments
     */
    public static void main(String[] arg) {
        Team teamA = new Team("Tigers", 17);
        Team teamB = new Team();
        Player[] players = new Player[teamA.getMaxSize()];
        String[] playerNames = {"Bob", "BobRoss", "Rob", "Mob", "TheMan", "TheMyth", "TheLegend", "John", "cya", "Jaz", "Blues", "Ratatouille", "RatCourcile", "Flash", "McQueen", "Teemo", "Ekko"};

        // Initialize all 17 players
        for (int i = 0; i < playerNames.length; i++) {
            players[i] = new Player(i, playerNames[i]);
        }

        // Step 2 Add 2 players using the default constructor to Team A

        try {
            teamA.insert(new Player());
            teamA.insert(new Player());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }


        // Step 3 Fill up both teams with players (Team A)
        try {
            for (int i = 1; i < teamA.getMaxSize(); i++) {
                teamA.insert(players[i]);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        // Step 3 Fill up both teams with players (Team B)
        try {
            for (int i = 0; i < teamB.getMaxSize(); i++) {
                teamB.insert(players[i]);
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        // Step 4 Try inserting more players after filling them and handle the exception
        try {
            teamA.insert(new Player(18, "Rose"));
            teamB.insert(new Player(18, "Rose"));
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        try {
            teamB.insert(new Player(18, "Rose"));
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }


        // Step 5 Test to see if method contains is consistent

        // Team A
        System.out.println(teamA.contains(teamA.getTeamMates().get(5)));
        System.out.println(teamA.contains(teamA.getTeamMates().get(5)));
        System.out.println(teamA.contains(players[0]));
        System.out.println(teamA.contains(players[0]));

        // Team B
        System.out.println(teamB.contains(players[0]));
        System.out.println(teamB.contains(players[2]));

        // Step 6
        System.out.println(teamA);
    }
}
