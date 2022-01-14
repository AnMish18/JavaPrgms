//QN 5
//11-Anwesha mishra
import java.util.Scanner;
public class SwapVarused { 

    public static void main(String[] args)
    {
        int x,y;
        System.out.println("Enter the values x and y:");
        Scanner qw= new Scanner(System.in);
        x=qw.nextInt();
        y=qw.nextInt();
        x = x * y; 
        y = x / y; 
        x = x / y;  
        System.out.println("After swaping:" + x + " " + y);
    }
}

