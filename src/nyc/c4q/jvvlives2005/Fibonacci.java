package nyc.c4q.jvvlives2005;

/**
 * Fibonacci
 * * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 Write a program which accepts as input an integer N and returns the N-th Fibonacci number.
 To test whether your program returned the correct number, go to Wolfram Alpha,
 and enter fibonacci(N) where N is your input integer
 * Created by c4q-joshelynvivas on 3/21/15.
 */

import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]) {

        //input to print Fibonacci series upto how many numbers
        System.out.print("Enter number: ");
        int number = new Scanner(System.in).nextInt();

        System.out.print("Your Fibonacci number is: ");

        int num = 0;
        int num2 = 1;
        int loop;
        int fibonacci;

        for (loop = 1; loop < number; loop ++) {     //start at index 1, not 0
            fibonacci = num + num2;                  //the fibonacci formula
            num = num2;
            num2 = fibonacci;

        }
        System.out.print(num2);

    }
}

