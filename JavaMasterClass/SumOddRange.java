package JavaMasterClass;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-4,6));

    }

    public static boolean isOdd (int number) {
        if (number < 0){
            return false;
        }
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    public static int sumOdd (int start, int end) {
       int sum = 0;
      if ((end >= start) && (start > 0)){
        for (int i = start; i <= end ; i++) {
            if (isOdd(i)) {
                sum = sum + i;
            }
        }
          return sum;
      } else {
          return -1;
      }
    }
}
