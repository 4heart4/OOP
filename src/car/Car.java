package car;

public class Car {
    private double engine;
    private int speed;
    private boolean start;

    public double getEngine () {
        return engine;
    }

    public void setEngine (double engine) {
        this.engine = engine;
    }

    public void startEngine () {
        start = true;
        System.out.println("Start the engine." + "The car starts to drive");
    }

    public void drive () {
        System.out.println("Car drive");
    }


    public void keepSpeed (int x) {
        speed += x;
        System.out.println("is driving " + speed + " kilometers per hour.");
    }


    public void stopEngine () {
        start = false;
        System.out.println("The engine stopped working");
    }

    public void stopCar () {
        speed = 0;
        System.out.println("The car stopped");
    }
}