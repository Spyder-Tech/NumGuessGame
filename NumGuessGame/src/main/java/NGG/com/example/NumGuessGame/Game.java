package NGG.com.example.NumGuessGame;

import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.Scanner;

@Component
public class Game
{

    private int randomNumber;
    private int attempts;
    private final int maxAttempts = 5; // Limit number of attempts

    public void startGame()
    {
        Random random = new Random();
        this.randomNumber = random.nextInt(100) + 1;
        this.attempts = 0;

        System.out.println("\nWelcome to the Number Guessing Game!");
        System.out.println("I've picked a number between 1 and 100. Try to guess it within 5 attempts.");

        Scanner scanner = new Scanner(System.in);
        while (attempts < maxAttempts)
        {
            System.out.print("Enter your guess: \n");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                scanner.close();
                return;
            }
        }

        System.out.println("You ran out of attempts. The number was: " + randomNumber);
        scanner.close();
    }
}