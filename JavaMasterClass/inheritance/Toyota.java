package JavaMasterClass.inheritance;

public class Toyota extends Car {
    private int roadServiceMonths;

    public Toyota(int roadServiceMonths) {
        super("Toyota Corolla", "Verso", 4, 6, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(0);
        } else if ((newVelocity > 0) && (newVelocity <= 10)) {
            changeGear(1);
        } else if ((newVelocity > 10) && (newVelocity <= 30)) {
            changeGear(2);
        } else if ((newVelocity > 30) && (newVelocity <= 50)) {
            changeGear(3);
        } else if ((newVelocity > 50) && (newVelocity <= 70)) {
            changeGear(4);
        } else changeGear(5);

        if (newVelocity > 0) {
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
