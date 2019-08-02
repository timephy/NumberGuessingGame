import java.util.Scanner;

class GuessingGameTwoPlayers {
    public static void main(String[] args) {

        // Setup the players
        Player player1 = new Player("PlayerOne", -1, '?');
        Player player2 = new Player("PlayerTwo", -1, '?');

        // Print players
        System.out.println("The players are:");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(); // newline for style

        // Setup the number to guess
        int value = (int) (Math.random() * 100);
        System.out.println("(The number to guess is: " + value + ")");

        // Setup the Scanner (a wrapper of the system input stream)
        Scanner scanner = new Scanner(System.in);
        // Get the guesses from the players
        System.out.print(player1 + ", please input your guess: ");
        int guess1 = scanner.nextInt(); // read text input as int
        System.out.print(player2 + ", please input your guess: ");
        int guess2 = scanner.nextInt(); // read text input as int

        // Computing difference to value
        int difference1 = Math.abs(value - guess1);
        int difference2 = Math.abs(value - guess2);

        // Print results
        System.out.println(); // newline for style
        System.out.println("The number to guess was: " + value);
        System.out.println("Player " + player1 + " guessed " + guess1 + " (difference: " + difference1 + ").");
        System.out.println("Player " + player2 + " guessed " + guess2 + " (difference: " + difference2 + ").");
        System.out.println(); // newline for style

        // Conclusion
        if (difference1 == difference2) { // draw
            System.out.println("It's a draw!");
        } else if (difference1 < difference2) { // player1 won
            System.out.println("Player " + player1 + " won!");
        } else { // player2 won
            System.out.println("Player " + player2 + " won!");
        }

        // Close scanner for good measure
        scanner.close();
    }
}
