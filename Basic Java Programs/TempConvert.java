//QN 10
//11-Anwesha mishra
import java.util.Scanner;
public class TempConvert 
{
    public static void main(String[] args) 
    {
        double c, f;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        f = s.nextDouble();
        c= (f-32)*(0.5556);   //0.556 is 5/9
        System.out.println("Temperature in Celsius:"+c);        
    }
}
