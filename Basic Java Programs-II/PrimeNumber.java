/*qn 8
Anwesha Mishra-11*/
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String []args){
        int n, i,c=0;
      Scanner sm = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      n = sm.nextInt();
      for(i=2;i<n; i++)
      {
         if(n%i == 0)
         {
            c++;
            break;
         }
      }
       if(c==0)
         System.out.print("PRIME NUMBER");
      else
         System.out.print("COMPOSITE NUMBER.");
   }
    }

