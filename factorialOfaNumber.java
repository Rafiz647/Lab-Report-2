import java.util.Scanner;
public class factorialOfaNumber {
     public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fact=1;
        for (int i = 1; i <=N; i++) {
            fact=fact*i;
        }System.out.println(fact);
    }
}
