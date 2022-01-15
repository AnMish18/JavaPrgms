/*qn 13
Anwesha Mishra-11*/
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args){
     int size, large,i;
     Scanner qr = new Scanner(System.in);
     System.out.print("The size of array is: ");
     size = qr.nextInt();
     int arr[] = new int[size];
     System.out.println("The elements in array are: ");
     for(i = 0; i < size; i++)
    {
      arr[i] = qr.nextInt();
    }
    large = arr[0];
    for( i = 0; i < size; i++)
    {
      if(large < arr[i])
    {
      large = arr[i];
    }
    }
System.out.println("The largest value in the array is :"+large);
}
}

