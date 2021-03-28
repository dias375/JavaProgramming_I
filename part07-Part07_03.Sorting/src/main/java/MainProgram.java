
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            if (smallest == currentNumber) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int holder = array[index1];
        array[index1] = array[index2];
        array[index2] = holder;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = indexOfSmallestFrom(array, i);
            swap(array, i, index);
            System.out.println(Arrays.toString(array));
        }

    }

}
