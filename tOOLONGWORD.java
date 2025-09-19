import java.util.Scanner;

public class tOOLONGWORD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of words

        for (int i = 0; i < n; i++) {
            String w = sc.next(); // take word
            if (w.length() > 10) {
                System.out.println(w.charAt(0) + "" + (w.length() - 2) + w.charAt(w.length() - 1));
            } else {
                System.out.println(w);
            }
        }
    }
}
