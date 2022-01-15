/*Qn 1 
Anwesha Mishra-11*/
import java.util.Scanner;

public class PosNeg {
   public static void main(String args[]){
      int num;
      System.out.println("Enter number");
      Scanner m = new Scanner(System.in);
      num = m.nextInt();

      if (num > 0){
         System.out.println("Number is +ve "+ num);
      } else {
         System.out.println("Number is -ve "+ num);
   }
}
}