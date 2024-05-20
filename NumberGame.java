
import java.util.Scanner;

public class NumberGame {
    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        int playagain = 1;
        // Generate the numbers
        while (playagain == 1) {
            int number = 1 + (int) (100 * Math.random());
            // Given K trials
            int K = 7;

            int i, guess;

            System.out.println(
                    "A number is chosen" + " between 1 to 100." + "Guess the number" + " within " + K + " trials.");

            // Iterate over K Trials
            for (i = 0; i < K; i++) {

                System.out.println("Guess the number:");

                // Take input for guessing
                guess = sc.nextInt();

                // If the number is guessed
                if (number == guess) {
                    System.out.println("Congratulations!" + " You guessed the number.");
                    // sc.close();
                    break;
                } else if (number > guess && i != K - 1) {
                    System.out.println("The number is " + "greater than " + guess);
                } else if (number < guess && i != K - 1) {
                    System.out.println("The number is" + " less than " + guess);
                }
            }

            if (i == K) {
                System.out.println("You have exhausted " + K + " trials.");

                System.out.println("The number was " + number);
            }
            System.out.println("Do you want to play again ? (YES = 1 | NO = 0)");
            playagain = sc.nextInt();
        }
    }

    // Driver Code
    public static void main(String arg[]) {

        // Function Call
        guessingNumberGame();
    }
}