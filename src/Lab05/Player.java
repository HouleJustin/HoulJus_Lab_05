/*
 * Name: Justin Houle
 * Date: 2022/02/22
 * Description: a class that defines a player in a team.
 */
package Lab05;

/**
 * The class "player" is used to initialize new players for a team
 */
public class Player {
    private int  position;
    private String name;

    /**
     * A default constructor initializing a new player
     * and giving a default position of 0 and name of "Senna" to that player.
     */
    public Player(){
        this(0, "Senna");
    }

    /**
     * A constructor which initializes the name and position of a new player.
     *
     * @param position the integer value of the position in the team the player is.
     * @param name the String name of that player
     */
    public Player(int position, String name){
        this.position = position;
        this.name = name;
    }

    //getters/**

    /**
     * Gives access to the value of the private variable "position"
     *
     * @return the integer value of the private variable "position"
     */
    public int getPosition(){
        return this.position;
    }

    /**
     * Gives access to the String of the private variable "name".
     *
     * @return the String of the private variable "name"
     */
    public String getName(){
        return this.name;
    }

    /**
     * Overrides the superclass method "equals(Object ob)" from java methods.
     *
     * @param ob the object which is to be compared to by another player
     * @return a boolean if the object is equivalent to the other player
     */
    @Override
    public boolean equals(Object ob){
        // Check if the argument is a reference to this object
        if(ob == this){
            return true;
        }

        // cast the argument to the correct type
        Lab05.Player p = (Lab05.Player) ob;

        return ((this.name == p.getName()) && (this.position == p.getPosition()));

    }

    /**
     * Overrides the method "toString" from the java superclass.
     *
     * @return the string value and not location
     */
    @Override
    public String toString(){
        return "Player name: " + this.name + ", Player #: " + this.position;
    }

}
