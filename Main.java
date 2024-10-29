import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);


        //1.Write a program to find all the longest word in a given dictionary.

//        String[] array = {"cat", "dog", "red", "is", "am"};
//        int max = 0;
//        ArrayList<String> longestWords = new ArrayList<>();
//        for (String word : array) {
//            int length = word.length();
//            if (length > max) {
//                max = length;
//                longestWords.clear();
//                longestWords.add(word);
//            } else if (length == max) {
//                longestWords.add(word);
////            }
////        }
//           System.out.println("Longest words is: " + longestWords);
//

        //2. Write a program that displays the number of occurrences of an element in the array.

//        int [] array ={1,1,1,3,3,5};
//
//        boolean[] visited = new boolean[array.length];
//        System.out.println("Occurrences of each element:");
//        for (int i = 0; i < array.length; i++) {
//            if (!visited[i]) {
//                int count = 1;
//                for (int j = i + 1; j < array.length; j++) {
//                    if (array[i] == array[j]) {
//                        count++;
//                        visited[j] = true;
//                    }
//                }
//                System.out.println(array[i] + " occurs " + count + " times");
//            }
//        }


        //3.Write a program to find the k largest elements in a given array. Elements in the array can be in any order.
//        int[] array = {1, 4, 17, 7, 25, 3, 100};
//        int k = 3;
//        System.out.println("Original Array: ");
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] < array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        System.out.println(k + " largest elements of the said array are:");
//        for (int i = 0; i < k; i++) {
//            System.out.print(array[i] + " ");
        //4. Create a method to reverse an array of integers. Implement the method without creating a new array.
//        int[] array = {5, 4, 3, 2, 1};
//        System.out.println("Original Array: " + Arrays.toString(array));
//        System.out.println("reversed Array: " + Arrays.toString(reverseArray(array)));


        //5. Write a menu-driven Java program with following option:
//        System.out.print("Enter the size of the array: ");
//        int size = input.nextInt();
//        int[] array = new int[size];
//
//        boolean menu = true;
//        while (menu) {
//            System.out.println("Menu:");
//            System.out.println("1. Accept elements of the array");
//            System.out.println("2. Display elements of the array");
//            System.out.println("3. Search for an element in the array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. end");
//            System.out.print("Choose an option from 1 to 5: ");
//
//            int choice = input.nextInt();
//
//            switch (choice){
//
//                case 1:  acceptElements(array, input);
//                    break;
//                case 2:displayElements(array);
//                    break;
//                case 3:System.out.print("please Enter element to search: ");
//                    int element = input.nextInt();
//                    searchElement(array, element);
//                    break;
//                case 4: sortArray(array);
//                    System.out.println("the Array sorted.");
//                    break;
//                case 5: menu = false;
//                    System.out.println(" program ended.");
//                    break;
//            }
//
//        }

         /* 6. Create a method that generates a random number within a given range. Allow the user to specify
         the range and call the method to display random numbers.
         */
//        System.out.print("Enter the minimum value of the range: ");
//        int min = input.nextInt();
//
//        System.out.print("Enter the maximum value of the range: ");
//        int max = input.nextInt();
//
//        System.out.print("Enter the number of random numbers to generate: ");
//        int count = input.nextInt();
//
//        System.out.println("Random numbers within the specified range:");
//        for (int i = 0; i < count; i++) {
//            int randomNumber = randomNumber(min, max);
//            System.out.print(randomNumber + " ");
//        }
          /* 7. Write a program that checks the strength of a password. Create a method that evaluates a password
        based on criteria like length, inclusion of special characters, and uppercase/lowercase letters.
         */

//        System.out.print("Enter a password: ");
//        String password = input.nextLine();
//
//        int totalScore = checkLength(password) + checkCharacters(password) + checkUpperLower(password);
//        if (totalScore >= 8) {
//            System.out.println("Password is strong.");
//        } else if (totalScore >= 5) {
//            System.out.println("Password is moderately strong.");
//        } else {
//            System.out.println("Password is weak.");
//        }

         /* 8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
          Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
           and each subsequent number in the sequence is the sum of the two preceding ones.
         */
//        System.out.print("Enter the number of Fibonacci terms to generate: ");
//        int terms = input.nextInt();
//
//        System.out.println("Fibonacci sequence with " + terms + " terms:");
//        generateFibonacci(terms);

    }
//    //4
//    public static int[] reverseArray(int[] array) {
//        int i = 0, j = array.length - 1;
//        for (i = 0; i < array.length / 2; i++, j--) {
//            int temp = array[i];
//            array[i] = array[j];
//            array[j] = temp;
//        }
//        return array;
//    }
    //5
//public static void acceptElements(int[] array, Scanner input) {
//    System.out.println("Enter " + array.length + " elements:");
//    for (int i = 0; i < array.length; i++) {
//        System.out.print("Element " + (i + 1) + ": ");
//        array[i] = input.nextInt();
//    }
//}
//    public static void displayElements(int[] array) {
//        System.out.println("Array elements:");
//        for (int element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//    }
//    public static void searchElement(int[] array, int element) {
//        boolean found = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == element) {
//                System.out.println("Element " + element + " found at position " + (i + 1));
//                found = true;
//                break;
//            }
//            if (!found) {
//                System.out.println("Element " + element + " not found in the array.");
//            }
//        }
//    }
//
//    public static void sortArray(int[] array) {
//        Arrays.sort(array);
//    }
    // 6
//public static Integer randomNumber(int min, int max) {
//
//    Random random = new Random();
//    return random.nextInt((max - min) + 1) + min;
//}

    // 7
//    public static Integer checkLength (String password){
//        int length = password.length();
//
//        if (length >= 8) {
//            return 3;
//        } else if (length >= 6) {
//            return 2;
//        } else {
//            return 0;
//        }
//
//    }
//
//    public static Integer checkCharacters (String password){
//        for (int i = 0; i < password.length(); i++) {
//            char c = password.charAt(i);
//            if (!Character.isLetterOrDigit(c)) {
//                return 2;
//            }
//        }
//        return 0;
//    }
//
//    public static Integer checkUpperLower (String password){
//        boolean Uppercase = false;
//        boolean Lowercase = false;
//
//        for (int i = 0; i < password.length(); i++) {
//            char c = password.charAt(i);
//            if (Character.isUpperCase(c)) {
//                Uppercase = true;
//            } else if (Character.isLowerCase(c)) {
//                Lowercase = true;
//            }
//        }
//
//        if (Uppercase && Lowercase) {
//            return 3;
//        } else {
//            return 0;
//        }
//    }

    //8
//    public static void generateFibonacci(int terms) {
//        if (terms <= 0) {
//            System.out.println("Please enter a positive number.");
//            return;
//        }
//        int[] fibonacciSequence = new int[terms];
//        fibonacciSequence[0] = 0;
//        if (terms > 1) {
//            fibonacciSequence[1] = 1;
//        }
//        for (int i = 2; i < terms; i++) {
//            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
//        }
//        for (int i = 0; i < terms; i++) {
//            System.out.print(fibonacciSequence[i] + " ");
//        }
//        System.out.println();
//    }


}


