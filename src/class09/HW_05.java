package class09;

public class HW_05 {
    // 5. Create an array to store char values and then print those in reverse order
    public static void main(String[] args) {
        char[] characters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

        for (int i = characters.length - 1; i >= 0; i--) {
            System.out.print(characters[i] + " ");
        }
    }
}
