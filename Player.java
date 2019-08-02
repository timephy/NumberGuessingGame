/** The Player model. */
class Player {
    /** The player's name. */
    String name;
    /** The player's age. */
    int age;
    /** The player's gender. */
    char gender;

    public Player(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * String representation of a player.
     * 
     * Format: "Name (Age, Gender)"
     */
    public String toString() {
        return name + " (" + age + ", " + gender + ")";
    }
}
