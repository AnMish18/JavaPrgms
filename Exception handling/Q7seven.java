//qn 7
//Anwesha Mishra-11
import java.util.InputMismatchException;
import java.util.Scanner;
class Inch{
    public static void main(String []args){
        double i,j,k=1;
        Scanner mw=new Scanner(System.in);
        try{
            System.out.println("Enter length");
            System.out.println("Feet: ");
            i=mw.nextDouble();
            System.out.println("Enter inches: ");
            j=mw.nextDouble();
            if(i<0 || j<0){
                throw new ArithmeticException();
            }
            k=(i*30.48)+(j*2.54);
            System.out.println("Length in centimeters is : "+ k);
        }
        catch(ArithmeticException e){
            System.out.println(e);
       }
       catch (InputMismatchException e){
           System.out.println(e);
       }
        
    }
}