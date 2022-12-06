/* Create class A
 * declare variable int i=10;
 * Create class B  extends A
 * declare variable int i=20;
 * create a method to display value of variable i from both classes
 * In Main Class create an object of subclass and call method display
 *              **Expected Output:**
 * 20
 * 10
 */

package Replit;

public class Task156 {

    public static void main(String[] args) {
        B myObj = new B();
        myObj.display();
    }
}


class A {

    int i = 10;

}


class B extends A {

    int i = 20;

    void display() {
        System.out.println(i);
        System.out.println(super.i);
    }
}
