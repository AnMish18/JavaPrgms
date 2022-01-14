//QN 9
//11-Anwesha mishra
import java.util.Scanner;
public class SimpleInt {
    public static void main(String args[]){
        Scanner am=new Scanner(System.in);
       System.out.println("enter the principal");
       Float p=am.nextFloat();
       System.out.println("Enter the rate ");
       Float r=am.nextFloat();
       System.out.println("Enter the time period ");
       Float t=am.nextFloat();
       Float ans=(p*r*t)/100;
       System.out.println("The simple interest is "+ans);

    }
}
