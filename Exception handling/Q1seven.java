//qn 1
//Anwesha Mishra-11
import java.util.Scanner;
class Q1seven
{
   public static void main(String args[])
    {
       int n1,n2,r;
       Scanner ma = new Scanner(System.in);
       System.out.println("Enter first integer :");
       n1=ma.nextInt();
       System.out.println("Enter second integer :");
       n2=ma.nextInt();
       try
       {
          if(n2==0){
          throw new ArithmeticException();
       }
          r=n1/n2;
          System.out.println("Result " +r);
       }
       catch(ArithmeticException e)
       {
          System.out.println(e);
          System.out.println("Enter second integer again :");
          n2=ma.nextInt();
          r=n1/n2;
          System.out.println("Result =" +r);
       }
       ma.close();
    }
}