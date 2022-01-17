//qn 3
//Anwesha Mishra-11
import java.util.Scanner;
class Q3seven{
    public static void main(String []args){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("The elements in the array are");
        for(int i=0;i<8;i++){
            System.out.println(arr[i]);
        }
      Scanner pm = new Scanner(System.in);
      System.out.println("Enter the index");
      try {
         int ele = pm.nextInt();
         System.out.println("The element in the index "+arr[ele]);
      } 
      catch(ArrayIndexOutOfBoundsException e) {
         System.out.println(e);
         System.out.println("Enter index between 0 and 7 ");
      }
   }
}
