package circle;

public class RunCircle {
    public static void main(String[] args) {
        Circle newCircle = new Circle(4);
        Circle oldCircle = new Circle(1);
        System.out.println("new circle square is: " + newCircle.getAreaOfCircle());
        System.out.println("Total circles qty: " + Circle.getCirclesQty());
    }
}
