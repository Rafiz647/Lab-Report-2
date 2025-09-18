
import java.util.Scanner;

public class sumOfNumbers {
     public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0;
        for (int i = 1; i <=N; i++) {
            sum=sum+i;
        }System.out.println(sum);
    }
}
