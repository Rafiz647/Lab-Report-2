import java.util.Scanner;
public class palindrome {
     public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int f = 1;
    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                f = 0;
                break;
            }
        }
        if (f == 1) 
            System.out.println("Palindrome");
        else 
            System.out.println("Not Palindrome");
    }
}
