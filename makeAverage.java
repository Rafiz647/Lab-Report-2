import java.util.Scanner;

public class makeAverage {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int C = sc.nextInt();
        
        if ((A + C) % 2 == 0) {
            int B = (A + C) / 2;
            System.out.println("YES B=" + B);
        } else {
            System.out.println("NO");
        }
    }

}
