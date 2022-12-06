package class09;

public class Clock1MoreWay {
    public static void main(String[] args) {
        for (int h = 0; h < 24; h++) {                       // this line controls hours
            for (int m1 = 0; m1 <= 5; m1++) {               // this line controsl first digits on minutes from 0 to 5
                for (int m2 = 0; m2 <= 9; m2++) {        // this line controls second digits of minutes from 0 to 9
                    if (h < 10) {
                        System.out.println("0" + h + ":" + m1 + m2);
                    } else {
                        System.out.println(h + ":" + m1 + m2);
                    }
                }
            }
        }
    }
}
