package car;

public class Car {
    private boolean startEngine;
    private Integer drive;
    private double stop;

    void startEngine () {
        startEngine = true;
        System.out.println("Engine is on");
    }

    void drive () {
        System.out.println("Car drive");

    }

    void speed (int speed) {
        System.out.println("Is speed" + speed + "km/h");

    }
    void Stop () {
        System.out.println("Stop car");
    }
}