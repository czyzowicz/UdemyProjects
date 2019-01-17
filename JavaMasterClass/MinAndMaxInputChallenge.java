package JavaMasterClass;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean first = true;


        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    max = number;
                    min = number;
                }
            if (number > max) {
                max = number;
            }
            if (number < min){
                min = number;
            }

            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min = " + min + " max " + max);
        scanner.close();
    }
}
