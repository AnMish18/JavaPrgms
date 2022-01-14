//QN 8
//11-Anwesha mishra
import java.util.Scanner;
public class StudentMark {
    public static void main(String args[]){
        float a,b,c;
        System.out.println("Enter the mark of three subjects ");
        Scanner m=new Scanner(System.in);
        a=m.nextFloat();
        b=m.nextFloat();
        c=m.nextFloat();
        float q=(a+b+c)/3;
        System.out.println("the average mark is "+q);
    }
}
