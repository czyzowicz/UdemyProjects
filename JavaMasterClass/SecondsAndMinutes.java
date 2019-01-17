package JavaMasterClass;

public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-5));
    }
    public static String getDurationString (long minutes, long seconds){
        if ((minutes < 0)  || (seconds > 59) || (seconds < 0)) {
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        String hoursString = hours + "h ";
        String minutesString = remainingMinutes + "m ";
        String secondsString = seconds + "s ";

        if (hours < 10){
            hoursString = "0" + hoursString;
        }
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;
    }

    public static String getDurationString (long seconds){
        if (seconds < 0) {
            return "Invalid value";
        }
           long minutes = seconds / 60;
           long remainingSeconds = seconds % 60;
           return getDurationString(minutes,remainingSeconds);
    }
}
