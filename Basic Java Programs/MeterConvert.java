//QN 12
//11-Anwesha mishra
import java.util.Scanner;
public class MeterConvert {
    public static void main(String []args){
        double  meter, kilometer;
        Scanner q=new Scanner(System.in);
        System.out.println("Enter distance in meter");
        meter=q.nextDouble();
        kilometer = meter / 1000;     
		meter=meter%1000;       
        System.out.println(kilometer+"km : "+meter+"m");
    }
}
