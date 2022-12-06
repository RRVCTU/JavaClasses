package class8;

public class NewHomework {

    /* Create a digital clock using nested loops.
     * If you can, try to have a clock that would show 2 digits for hour and 2 digits for minutes.
     */
    public static void main(String[] args) {

        for (int i = 0; i <= 24; i++) {
            for (int j = 0; j <= 59; j++) {
                if (i < 10) {
                    if (j<10) {
                        System.out.println("0" + i + ":" + "0" + j);
                    } else {
                        System.out.println("0" + i + ":" + j);
                    }
                } else {
                    if (j<10) {
                        System.out.println(i + ":" + "0" + j);
                    } else {
                        System.out.println(i + ":" + j);
                    }
                }
            }
        }
    }
}