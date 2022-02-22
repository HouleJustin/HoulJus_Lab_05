/*
 * Name: Justin Houle
 * Date: 2022/02/22
 * Description: a class that defines a player in a team.
 */
package Lab05;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The class "Team" creates a team of players.
 */
public class Team {
    private String teamName = "Lions";
    private ArrayList<Player> roster;
    private int maxSize = 17;

    /**
     * Default constructor which, initializes a new Team with the default name "Team B".
     */
    public Team() {
        roster = new ArrayList<Player>();
    }

    /**
     * A constructor for the class "Library" to initialize a new team with its name.
     *
     * @param teamName the name of the new team
     * @param maxSize the max size for the amount of players in the roster
     */
    public Team(String teamName, int maxSize) {
        this.teamName = teamName;
        this.maxSize = maxSize;
        roster = new ArrayList<Player>();
    }

    //Getter

    /**
     * Make the priavte string variable "teamName" available.
     *
     * @return the String "teamName"
     */
    public String getTeamName() {
        return this.teamName;
    }

    /**
     * Exposes the value of the private variable "maxSize"
     *
     * @return the integer value of "maxSize"
     */
    public int getMaxSize() {
        return this.maxSize;
    }

    /**
     * Gives the arraylist of team players
     *
     * @return the arraylist roster
     */
    public ArrayList<Player> getTeamMates() {
        return roster;
    }


    /**
     * Checks if a player is in a roster or not.
     *
     * @param p the player which we want to know if it is in the roster
     * @return a boolean value true if the player is present in the roster else false if the player is not present or the roster is empty
     */
    public boolean contains(Player p) {
        Iterator<Player> iter = roster.iterator();

        while (iter.hasNext()) {
            if (p.equals(iter.next())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Inserts a Player into the roster. Cannot duplicate a player or exceed the maximum amount of players in the roster.
     *
     * @param p the new player that will be added into the ArrayList "roster"
     * @throws Exception if the max amount of players are reached or an identical player is reintroduced an exception is thrown.
     */
    public void insert(Player p) throws Exception {
        Iterator<Player> iter = roster.iterator();

        if (!iter.hasNext()) {
            roster.add(p);
            return;
        }

        if (roster.size() >= maxSize) makeError();

        else if (contains(p)) makeError();

        else roster.add(p);


    }

    /**
     * Throws an exception
     *
     * @throws Exception throws an exception if the max amount of players is reached and a new player wants to be added
     *                   and/or when a new player is identical to a current player in the roster;
     */
    public void makeError() throws Exception {
        throw new Exception("Player limit exceeded or player already exists in roster");
    }

    /**
     * Exposes the iterator for the roster of players
     *
     * @return the iterator of the roster
     */
    public Iterator<Player> iterator() {
        return roster.iterator();
    }

    /**
     * Overrides the method "toString" from the java superclass.
     *
     * @return the string value and not location
     */
    @Override
    public String toString() {
        for (int i = 0; i < maxSize; i++) {
            return roster.toString();
        }
        return null;
    }


}
