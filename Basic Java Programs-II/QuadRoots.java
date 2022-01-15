/* qn 5
Anwesha Mishra-11*/
import java.util.Scanner;
public class QuadRoots {
    public static void main(String []args){
    Scanner am = new Scanner(System.in);  
    System.out.print("Equation is of form ax^2+bx+c :" ); 
    System.out.print("Enter a :");
    double a = am.nextDouble();  
    System.out.print("Enter b: ");  
    double b = am.nextDouble();  
    System.out.print("Enter c : ");  
    double c = am.nextDouble();  
    double disc= b * b - 4.0 * a * c;  
    double r1,r2;
       if (disc> 0.0)   
         {  
             r1 = (-b + Math.pow(disc, 0.5)) / (2.0 * a);  
             r2 = (-b - Math.pow(disc, 0.5)) / (2.0 * a);  
           System.out.println("Roots are " + r1 + "& " + r2);  
        }   
        else if (disc == 0.0)   
        {  
         r1 =r2= -b / (2.0 * a);  
          System.out.println("Roots are equal " + r1);  
        }   
       else   
        {  
        System.out.println("Roots are not real.");  
        }  
}  
 

    }

