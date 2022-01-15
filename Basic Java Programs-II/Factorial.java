/*qn 7
Anwesha Mishra-11*/
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
    int n,fact=1,i=1;
    Scanner as=new Scanner(System.in);
    System.out.print("Number is : ");
    n=as.nextInt();
         do
           {
              fact=fact*i;
                 i++;
           }
        while(i<=n);
        System.out.println("factorial is : "+fact);

}

}

