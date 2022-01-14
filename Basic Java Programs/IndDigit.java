//Qn 15
//11-Anwesha Mishra
import java.util.Scanner;  
public class IndDigit 
{  
public static void main(String arg[])  
{  
int n, sum;  
Scanner sm=new Scanner(System.in);  
System.out.print("Enter a four digit number");  
n=sm.nextInt();    
for(sum=0; n!=0; n=n/10)  //n=n/10 to extract each digit of the number
{  
sum = sum + n % 10;   //remainder of n 
}  
System.out.println("Sum of digits: "+sum);  
}  
}  
