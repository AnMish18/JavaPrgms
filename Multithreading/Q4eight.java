//qn 4
//Anwesha Mishra-11
import java.util.Scanner;
class Q4eight
{
   public static void main(String args[])
   {
      String string, rev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter string to check palindrome:");
      string = sc.next();
 
      int length = string.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + string.charAt(i);
      System.out.println("The reverse of the string is: "+ rev);
      if (string.equals(rev))    //if the string is equal to its reverse
         System.out.println(string+" palindrome");
      else
         System.out.println(string+" not a palindrome");
 
   }
}
