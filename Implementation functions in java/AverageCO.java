/*Write a program to Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
 Define another driver class to demonstrate the basic operation.
 Anwesha Mishra-11
 qsn 1 
*/
import java.util.Scanner; 
 class Average
 { 
    public int a,b,c; 
     void average(int a, int b,int c) 
    { 
            this.a=a;
            this.b=b;
            this.c=c;
             float d; 
              d=(float)(a+b+c)/3; 
             System.out.println("Avg of numbers is:- "+d); 
             } 
 }
 class AverageCO
 { 
public static void main (String args[]) { 
                         Scanner ms=new Scanner(System.in);  
                         System.out.print("Enter the numbers: "); 
                         int a=ms.nextInt();
                         int b=ms.nextInt();
                         int c=ms.nextInt();
                         Average z=new Average(); 
                        
                         
                         z.average(a,b,c);

             } 
 }
 