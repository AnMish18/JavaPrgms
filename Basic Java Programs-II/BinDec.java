/*qn 10
Anwesha Mishra-11*/
import java.util.Scanner;
public class BinDec {
    public static void main(String args[]) {
    int n,i=0;
        Scanner s1=new Scanner(System.in);
    System.out.print("Enter an integer: ");
    n=s1.nextInt();
    int  binary[]=new int[100];
    i = 0;
    while(n > 0)  //repeat until n>0
    {
    binary[i++] = n%2; //storing the remainder 
       n = n/2;  //divide the no by 2
    }
   System.out.print("Binary equivalent:~ ");
    for(int j = i-1;j >= 0;j--)  //bin array in reverse order
   {
       System.out.print(binary[j]);
   }
}
}
    

