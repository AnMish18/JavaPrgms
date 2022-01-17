//qn 2
//Anwesha Mishra-11
import java.util.Scanner;
class Q2seven{
    public static void main(String []args){
        int x,y;
        Scanner q=new Scanner(System.in);
        System.out.println("Enter two integers");
        x=q.nextInt();
        y=q.nextInt();
        try{
            if(x-y==0){
                throw new ArithmeticException();
            }
            else{
            int r=x/(x-y);
            System.out.println("Result "+r);
        }
    }
        catch(ArithmeticException e){
            System.out.println(e);
        }

    }
}
