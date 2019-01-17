package JavaMasterClass;

public class BarkingDog {
    public static boolean bark (boolean awake, int hourOfDay) {
        if ((hourOfDay > 23) && (hourOfDay<0)){
            return false;
        }
        else if (((hourOfDay == 23) || (hourOfDay < 8)) && (awake == true)) {
            return true;}
        else {
            return false;
        }
    }
}