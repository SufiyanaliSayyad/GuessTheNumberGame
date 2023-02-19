import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int guess;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I am thinking of a number between 1 and 10...");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Sorry, your guess is too low. Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Sorry, your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations, you guessed the number!");
                System.out.println("It took you " + attempts + " attempts to guess the number.");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
