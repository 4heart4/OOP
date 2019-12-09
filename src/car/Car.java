package car;

class Car {
    private double engine;
    private int speed;
    private boolean start;

    private double getEngine () {
        return engine;
    }

    private void setEngine (double engine) {
        this.engine = engine;
    }

    void startEngine () {
        start = true;
        System.out.println("Start the engine." + "The car starts to drive");
    }

    void drive () {
        System.out.println("Car drive");
    }


    void keepSpeed (int x) {
        speed += x;
        System.out.println("Is driving " + speed + " kilometers per hour.");
    }

    void stopCar () {
        speed = 0;
        System.out.println("The car stopped");
    }


    void stopEngine () {
        start = false;
        System.out.println("The engine stopped working");
    }
}