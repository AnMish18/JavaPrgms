/*qn 14
Anwesha Mishra-11*/
import java.util.Scanner;
public class Interchange {
    public static void main(String []args) 
    { int max,min,maxi,mini,i,temp;
        Scanner qm=new Scanner(System.in);
        System.out.print("Enter 5 elements ");
        int a[]=new int[5];
        for(i=0;i<5;i++){
              a[i]=qm.nextInt();
        }
        max=min=mini=maxi= a[0];
        for(i=0;i<5;i++){
            if(a[i]>max){
                max=a[i];
                maxi=i;  //for maximum number
            }
            if(a[i]<min){
                min=a[i];
                mini=i;  //for minimum number
            }
        }
        temp=a[maxi];
        a[maxi]=a[mini];
        a[mini]=temp;
        System.out.println("After interchanging :");
        for(i=0;i<5;i++){
            System.out.print(" "+ a[i]);
        }


        
    }
}
