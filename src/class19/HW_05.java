package class19;
/*
Write program: Shape class has a constructor that takes the radius and has a subclass as circle class.
In circle class create a method to calculate the area of circle. Test your code
 */
public class HW_05 {
    public static void main(String[] args) {
        Circle circleObj = new Circle(2);
        System.out.println(circleObj.areaOfCircle());
    }
}

class Shape{
    double radius;
    Shape(double radius) {
        this.radius = radius;
    }
}

class Circle extends Shape {
    Circle(double radius) {
        super(radius);
    }

    double areaOfCircle() {
        double area = 0;
        area = 3.14*(radius*radius);
        return area;
    }
}
