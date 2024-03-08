import java.util.Random;
import java.util.Scanner;

public class gessing_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;
        int totalAttempts = 0;
        int rounds = 0;

        do {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int guess;

            System.out.println("Guess a number between 1 and 100:");

            do {
                guess = scanner.nextInt();
                attempts++;

                if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                }

            } while (attempts < 10 && guess != numberToGuess);

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the number correctly.");
            } else {
                System.out.println("Sorry, you didn't guess the number. The number was " + numberToGuess);
            }

            totalAttempts += attempts;
            rounds++;

            System.out.println("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("You've played " + rounds + " rounds with an average of " + (double) totalAttempts / rounds + " attempts per round.");

        scanner.close();
    }
}
//gessing game 