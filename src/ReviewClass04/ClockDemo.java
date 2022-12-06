package ReviewClass04;

public class ClockDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 60; i++) {
            if (i < 10) {
                System.out.println("00:00:" + "0" + i);
            }
        }
    }
}
