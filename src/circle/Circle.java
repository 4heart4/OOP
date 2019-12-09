package circle;

public class Circle {
    private static int circlesQuantity;
    private Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
        circlesQuantity++;
    }
    public static int getCirclesQty() {
        return circlesQuantity;
    }

    public double getAreaOfCircle() {
        return (radius * radius) * Math.PI;
    }
}

