//QN 6
//11-Anwesha mishra
import java.util.Scanner;
public class CircleArea {
   public static void main(String args[]) {
       double r;
       System.out.println("Enter the radius of the circle");
       Scanner ms=new Scanner(System.in);
       r=ms.nextDouble();
       double area=3.14*r*r;
       System.out.println("the area of the circle is "+area);
   }
}
