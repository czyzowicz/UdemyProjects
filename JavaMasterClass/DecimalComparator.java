package JavaMasterClass;

public class DecimalComparator {
    public static  boolean areEqualByThreeDecimalPlaces (double number1, double number2){
        int num1 = (int) number1 * 1000;
        int num2 = (int) number2 * 1000;
        if (num1 == num2) {
            return true;
        } else
            return false;
    }
}
