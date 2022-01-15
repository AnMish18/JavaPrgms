/* qn 4
Anwesha Mishra-11*/
import java.util.Scanner;
public class StudentMark {
    public static void main(String args []) {
        float one,two,three,four,avg;
        Scanner ms=new Scanner(System.in);
        System.out.print("1st subject: ");
         one=ms.nextFloat();
         System.out.print("2nd subject : ");
        two=ms.nextFloat();
        System.out.print("3rd subject : ");
         three=ms.nextFloat();
         System.out.print("4th subject : ");
         four=ms.nextFloat();
         avg=(one+two+three+four)/4;
         switch((int)avg/10){
             case 9:
                   System.out.println("O grade");
                   break;
            case 8:
                   System.out.println("E grade");
                   break;
            case 7:
                   System.out.println("A grade");
                   break;
            case 6:
                   System.out.println("B grade");
                   break;
            case 5:
                   System.out.println("O grade");
                   break;
            default:
                  System.out.println("F grade");

         }

    }
}
