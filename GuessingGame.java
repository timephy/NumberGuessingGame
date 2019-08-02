import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        // Setup scanner with system input stream
        Scanner scanner = new Scanner(System.in);

        // Get amount of players
        System.out.println("# Setup game");
        System.out.print("Amount of players: ");
        int playerCount = scanner.nextInt();
        System.out.println(); // newline for style

        // Setup player-array with length of playerCount
        Player[] players = new Player[playerCount];

        // Read info of all players
        for (int i = 0; i < players.length; i++) {
            System.out.println("# Player " + i);
            // name
            System.out.print("name: ");
            String name = scanner.next();
            // age
            System.out.print("age: ");
            int age = scanner.nextInt();
            // gender
            System.out.print("gender: ");
            char gender = scanner.next().charAt(0);

            // Save player to array
            players[i] = new Player(name, age, gender);
            System.out.println(); // newline for style
        }

        // Print all players
        System.out.println("# The players are:");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
        System.out.println(); // newline for style

        // Setup the number to guess
        int value = (int) (Math.random() * 100);
        System.out.println("(The number to guess is: " + value + ")");

        // Get the guesses from the players
        int[] guesses = new int[players.length];

        System.out.println("# Now please input your guesses!");
        for (int i = 0; i < guesses.length; i++) {
            System.out.print(players[i] + ": ");
            guesses[i] = scanner.nextInt();
        }
        System.out.println(); // newline for style

        // Computing differences to value
        int[] differences = new int[players.length];
        for (int i = 0; i < differences.length; i++) {
            differences[i] = Math.abs(value - guesses[i]);
        }

        // Print results
        System.out.println("# Results:");
        System.out.println("The number to guess was: " + value);
        for (int i = 0; i < guesses.length; i++) {
            System.out.println(
                    "Player " + players[i] + " guessed " + guesses[i] + " (difference: " + differences[i] + ").");
        }
        System.out.println(); // newline for style

        // Conclusion - left out

        // Close scanner for good measure
        scanner.close();
    }
}
