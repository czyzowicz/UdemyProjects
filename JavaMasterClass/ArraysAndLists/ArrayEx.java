package JavaMasterClass.ArraysAndLists;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    private static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        int [] array = getInteger(5);
        int[] sorted = descendingOrder(array);
        printArray(sorted);
    }

    public static int [] getInteger (int capacity) {
        int [] array = new int [capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length ; i++) {
            array [i] = scanner.nextInt();
        }
        return array;
    }

    public static int [] descendingOrder (int [] unorderArray) {
//        int [] orderArray = new int[unorderArray.length];
//        for (int i = 0; i < unorderArray.length ; i++) {
//            orderArray[i] = unorderArray [i];
//        }
        int [] orderArray = Arrays.copyOf(unorderArray,unorderArray.length);

        boolean flag = true;
        int temp = 0;

        while (flag) {
        flag = false;
        for (int i = 0; i < orderArray.length -1; i++) {
            if (orderArray[i] < orderArray[i + 1]) {
                temp = orderArray [i];
                orderArray [i] = orderArray [i+1];
                orderArray [i+1] = temp;
                flag = true;
            }
        }
        }
        return orderArray;
    }
    public static void printArray (int [] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Element " + i + " contents " + array [i]);
        }
    }
}
