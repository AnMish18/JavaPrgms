//QN 14
//11-Anwesha mishra
import java.util.Scanner;
public class LargerThree {
    public static void main(String args[]){
        int a,b,c,large;
        Scanner nu=new Scanner(System.in);
        System.out.print("Enter first number :");
        a=nu.nextInt();
        System.out.print("Enter second number :");
        b=nu.nextInt();
        System.out.print("enter third number :");
        c=nu.nextInt();
        int temp;
        temp=a>b?a:b;   //if a>b then a is executed as true if false, then b is executed.
        large=c>temp?c:temp;  //it is a ternary operator
        System.out.println("The larger number is "+large);
        
    }
}
