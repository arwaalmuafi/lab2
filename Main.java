import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         /* 8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
          Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
           and each subsequent number in the sequence is the sum of the two preceding ones.
         */
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int terms = input.nextInt();

        System.out.println("Fibonacci sequence with " + terms + " terms:");
        generateFibonacci(terms);
    }
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        int[] fibonacciSequence = new int[terms];
        fibonacciSequence[0] = 0;
        if (terms > 1) {
            fibonacciSequence[1] = 1;
        }
        for (int i = 2; i < terms; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacciSequence[i] + " ");
        }
        System.out.println();
    }
}