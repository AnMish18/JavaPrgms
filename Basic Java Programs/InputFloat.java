//QN 3
//11-Anwesha mishra
import java.util.Scanner;
class InputFloat
{
   public static void main(String args[])
   {
      float x, y, z;

      System.out.println("Enter two numbers");
      Scanner in = new Scanner(System.in);
     
      x = in.nextFloat();
      y = in.nextFloat();
      z = x + y;
     
      System.out.println("Sum of the integers = " + z);
   }
}