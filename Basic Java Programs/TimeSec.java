//QN 11
//11-Anwesha mishra
import java.util.Scanner;
class TimeSec{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.print("Time in seconds~ ");
		int seconds = in.nextInt(); 
        int a = seconds % 60; //a for seconds
        int b = seconds / 60;
        int c = b % 60; //c for minutes
        b = b / 60;  //b for hours
        System.out.print( b + ":" + c + ":" + a);
    }
}