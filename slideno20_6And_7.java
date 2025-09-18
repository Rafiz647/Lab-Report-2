import java.util.Arrays;
import java.util.Scanner;

public class slideno20_6And_7 {
     public static void main(String[]a){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt(),i;
    int x[]=new int[n];
    for(i=0;i<n;i++)
        x[i]=sc.nextInt();
    int k=sc.nextInt();
    int f=0;
    for(i=0;i<n;i++)
        if(x[i]==k)
        {f=1;break;}
    if(f==1)System.out.println("Found");
    else 
    System.out.println("Not Found");
    Arrays.sort(x);
    System.out.print("Sorted=");
    for(i=0;i<n;i++)
    System.out.print(x[i]+" ");
  }
}
