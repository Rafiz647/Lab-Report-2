import java.util.Scanner;

public class slide20_1to5{
      public static void main(String[]a){
    Scanner sc=new Scanner(System.in);
    int n[]=new int[5],i,x,y,e=0,o=0,t=0;
    for(i=0;i<5;i++){
      n[i]=sc.nextInt();
      t+=n[i];
      if(n[i]%2==0)e++;else o++;
    }
    x=y=n[0];
    for(i=1;i<5;i++){
      if(n[i]<x)x=n[i];
      if(n[i]>y)y=n[i];
    }
    System.out.print("Arr=");
    for(i=0;i<5;i++)System.out.print(n[i]+" ");
    System.out.println("\nMax="+y+"\nMin="+x+"\nAvg="+t/5.0+"\nEven="+e+" Odd="+o);
  }
}