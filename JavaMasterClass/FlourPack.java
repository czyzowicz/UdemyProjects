package JavaMasterClass;

public class FlourPack {
    public static void main(String[] args) {
        System.out.println( canPack(1,0,4));
        System.out.println( canPack(0,5,4));
        System.out.println( canPack(0,5,6));
        System.out.println( canPack(2,2,12));
        System.out.println( canPack(1,0,4));
        System.out.println( canPack(2,1,5));

    }
    public static boolean canPack (int bigCount, int smallCount ,int goal) {
            bigCount = bigCount * 5;
            smallCount = smallCount * 1;

            if ((bigCount < 0) || (smallCount < 0) || (goal <0) || (bigCount *5 > goal)) {
                return false;
            } else if((bigCount + smallCount >= goal) && (smallCount >= goal % 5)) {
                return  true;
            } else {
                return  false;
            }
    }
}
