package ReviewClass04;

public class ScannerLoopDemo {

    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
            }
        }
        for (int j = 0; j < 5; j++) {
            int i = 0;
            while (i < 3) {
                System.out.println(i);
                i++;
            }
        }
    }
}
