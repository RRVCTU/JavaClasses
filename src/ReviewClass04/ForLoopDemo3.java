package ReviewClass04;

public class ForLoopDemo3 {

    public static void main(String[] args) {
// TODO Auto-generated method stub
//1 3 7 9
// break till 8:50
        for (int i = 1; i <= 9; i += 2) {
            if (i != 5) {
                System.out.println(i);
            }
        }
        for (int i = 1; i <= 9; i += 2) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
