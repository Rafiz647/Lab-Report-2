import java.util.Scanner;

public class countVandC {
    public static void main(String[]a){
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        int v=0,c=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') v++;
            else if(ch>='a' && ch<='z') c++;
        }
        
        System.out.println("Vowels="+v+" Consonants="+c);
    }
}
