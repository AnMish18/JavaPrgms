/*qn 12
Anwesha Mishra-11*/
import java.util.Scanner;
public class MeanArray {
    public static void main(String[] args) {
        int sum,i,size;
        Scanner sm = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        size=sm.nextInt();
        int array[] = new int[size];
        System.out.print("Enter numbers :  ");
        for ( i = 0; i < size; i++) {
            int num = sm.nextInt();
            array[i] = num;  //array of index 0 will place the number enterred by the user
        }
         sum = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
       double mean = sum / array.length;
       System.out.println("Mean of n numbers is  : " + mean);
 
}
}
