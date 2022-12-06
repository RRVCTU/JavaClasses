/* Access Modifiers

                For you to do:
    Please create methods with different access modifiers (one for each access modifier)
    and call them properly in Main method one by one

    In each method write the logic accordingly like for private method write the logic
    in the println Statement as "This is Private Method" accordingly for rest of the methods
    that have different access modifiers should be a total of 4 outputs,
    please make sure they are in the same order that is printed below.

                **Expected Output:**
    This is Private Method
    This is Default Method
    This is Protected Method
    This is Public Method
 */

package Replit;

public class Task136 {
    private void privateMethod() {
        System.out.println("This is Private Method");
    }

    static void defaultMethod() {
        System.out.println("This is Default Method");
    }

    protected void protectedMethod() {
        System.out.println("This is Protected Method");
    }

    public static void publicMethod() {
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        Task136 object = new Task136();
        object.privateMethod();
        defaultMethod();
        object.protectedMethod();
        publicMethod();

    }
}
