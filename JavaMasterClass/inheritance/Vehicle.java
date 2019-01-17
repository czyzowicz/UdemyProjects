package JavaMasterClass.inheritance;

public class Vehicle {
    private int km;
    private boolean isGearTurnOn;
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection=0;
        this.currentVelocity=0;
    }

    public void drive (int km, boolean isGearTurnOn) {
        if((km>0) && isGearTurnOn)
            System.out.println("Vehicle is moving");
    }

    public void move (int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Move at " + currentVelocity + " in direction " + currentDirection);
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isGearTurnOn() {
        return isGearTurnOn;
    }

    public void setGearTurnOn(boolean gearTurnOn) {
        isGearTurnOn = gearTurnOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void steer (int direction) {
        this.currentDirection =+ direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

}
