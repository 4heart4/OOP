package car;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.startEngine();
        bmw.drive();
        bmw.keepSpeed(50);
        bmw.stopEngine();
    }
}
