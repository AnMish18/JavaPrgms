/*qn 15
Anwesha Mishra-11*/
import java.util.Scanner;
public class ArrayTwoD {
    public static void main(String []args){
        int row,column,i,j;
        Scanner mp=new Scanner(System.in);
        System.out.print("Number of rows:  ");
         row=mp.nextInt();
        System.out.print("Number of column : ");
         column=mp.nextInt();
        int arr[][]=new int[row][column];   	 
        System.out.print("Enter the elements :\t");
            for ( i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                   arr[i][j] = mp.nextInt();
            }
        }   
            System.out.print("Elements :\n");
            for ( i = 0; i < row; i++)
        {
            for( j = 0; j < column; j++)
            {
               System.out.println("["+i+"]:["+j+"] " +arr[i][j]);
             }
        }  
       }
    }

