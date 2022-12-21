package class21;
/* Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectanle, Square, Box. Use separate class to test your code.
 */
public class Task1 {
    public static void main(String[] args) {
        AreaManager areaManager = new AreaManager();
        areaManager.calculateArea(10);
        areaManager.calculateArea(10,12);
        areaManager.calculateVolume(10, 12, 14);
    }
}

class AreaManager {
    void calculateArea (double length, double width) {
        System.out.println(length*width);
    }
    void calculateArea (double length) {
        System.out.println(length*length);
    }

    void calculateVolume(double length, double height, double width) {
        System.out.println(length*height*width);
    }
}
