package JavaMasterClass.inheritance;

public class Toyota extends Car {
    private int roadServiceMonths;

    public Toyota(int roadServiceMonths) {
        super("Toyota Corolla", "Verso", 4, 6, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate (int rate) {

    }
}
