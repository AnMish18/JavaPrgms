/*qn 9
Anwesha Mishra-11*/
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]) {
        int num,r,sum;
        Scanner fk = new Scanner(System.in);  
        System.out.print("The number is : ");  
        num=fk.nextInt();
        sum=0;
       int temp=num;    
       while(num>0)
       {    
       r=num%10;    
       sum=(sum*10)+r;    
       num=num/10;    
       }    
        if(temp==sum)    
        System.out.println("Palindrome Number");    
        else    
        System.out.println("Not a palindrome number");    
    }
}
