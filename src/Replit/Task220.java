package Replit;

public class Task220 {
    public static void main(String[] args) {
        System.out.println(formatString("00-44 48 555555"));

    }
    public static String formatString(String S){
        S = S.replaceAll("[^0-9]","");
        for (int i = 0; i < S.length(); i++) {
            System.out.print(S.charAt(i));
        }
        return S;
    }
}
