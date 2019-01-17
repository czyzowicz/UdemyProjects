package JavaMasterClass;

public class CodingExercises {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int restOfKB = kiloBytes % 1024;
        int megaBytes = (Math.floorDiv(kiloBytes,1024));
        if (kiloBytes < 0) {System.out.println("Invalid Value");}
        else {System.out.println(kiloBytes +" KB = " + megaBytes + " MB and " + restOfKB + " KB");
        }
    }


}
