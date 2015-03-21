package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/21/15.
 */
import java.util.Scanner;
public class TwentyQuestionsGame {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            Double integer = Math.random() * 100000;
            Integer x = integer.intValue();
            int i;

            System.out.println("Welcome to 20 Guesses! What is the integer X? Put a number between 1 to 100,000");

            for (i = 20; i > 0; i--) {                              //you have 20 guesses

                System.out.println("Your guess:");
                int guess = input.nextInt();

                if (guess > x) {
                    System.out.println("Your guess is greater than X.");
                } else if (guess < x) {
                    System.out.println("Your guess is lower than X.");
                } else {
                    System.out.println("You guessed the X right! Awesome!");
                    break;
                }

            }

            if (i == 0)
                System.out.println("Sorry, you're out of chances!");       //when the 20 guesses are up
        }
}
