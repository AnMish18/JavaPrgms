//QN 13
//11-Anwesha mishra
import java.util.Scanner;
public class LargerTwo {
    public static void main(String []args){
        int a,b;
        Scanner pq=new Scanner(System.in);
        System.out.println("enter both the numbers to determine larger one ");
        a=pq.nextInt();
        b=pq.nextInt();
        if(a>b){
            System.out.println("Larger number is :"+a);
        }
        else if (b>a){
            System.out.println("Larger number is :"+b);
        }
        else{
            System.out.println("the numbers are equal");
        }
    }
    
}
