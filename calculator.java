import java.util.Scanner;

public class calculator {
    public static void main(String[]a){
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    int y=s.nextInt();
    char o=s.next().charAt(0);
    int r=0;
    if(o=='+')r=x+y;
    else if(o=='-')r=x-y;
    else if(o=='*')r=x*y;
    else if(o=='/')r=x/y;
    System.out.println(r);
  }
}
