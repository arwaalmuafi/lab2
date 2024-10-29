import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //4. Create a method to reverse an array of integers. Implement the method without creating a new array.
        int[] array = {5, 4, 3, 2, 1};
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("reversed Array: " + Arrays.toString(reverseArray(array)));
    }

    public static int[] reverseArray(int[] array) {
        int i = 0, j = array.length - 1;
        for (i = 0; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}