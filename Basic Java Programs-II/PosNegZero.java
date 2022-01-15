/*qn 2
Anwesha Mishra-11*/
import java.util.Scanner;

public class PosNegZero {
   public static void main(String args[]){
      int num;
      System.out.println("Enter a number ::");
      Scanner ms = new Scanner(System.in);
      num = ms.nextInt();

      if (num > 0){
         System.out.println("Positive number");
      } else if(num < 0){
         System.out.println("Negative number");
      } else {
         System.out.println("Zero");
      }
   }
}
