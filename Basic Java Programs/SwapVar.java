//QN 4
//11-Anwesha mishra
import java.util.*;  
class SwapVar {  
    public static void main(String[] args) {  
       int x, y, z;  
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();         
       z = x;  //z is taken as the container variable which temporarily stores x. 
       x = y;  
       y = z;  
       System.out.println("After swapping: "+x +"   " + y);  
    }    
}  