package class20;

public class HW1_Area {

    /* Create 1 class in which create a methods that will calculate the area (volume in case of box) of:
    - Rectangle
    - Square
    - Box
    Use separate class to test your code.
     */
    double width;
    double length;
    double side;

    HW1_Area(double width, double length, double side) {
        this.width = width;
        this.length = length;
        this.side = side;
    }
    static void area(double width, double length) {
        System.out.println("Area of Rectangle is "+(width*length));
    }
    static void area(double width) {
        System.out.println("Area of Square is "+(width*width));
    }
    static void area(double width, double length, double side) {
        System.out.println("Area of Box is "+((2*width*length)+(2*length*side)+(2*width*side)));
    }
}
class AreaCalculator extends HW1_Area {
    AreaCalculator(double width, double length, double side) {
        super(width, length, side);
    }

    public static void main(String[] args) {
        area(3,5);
        area(8);
        area(12,14,15);
    }
}
