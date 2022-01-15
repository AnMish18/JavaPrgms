/*qn 11
Anwesha Mishra-11*/
public class ArmstrongNum{
    public static void main(String[] args) {

        int one=1, last=10000,n,on,digit=0,sum=0,rem;
    
        for(n =one; n < last;n++) {
          digit=sum=0;
          on = n;
          while (on != 0) {
            on /= 10;
            digit++;  //calculating the number of digits i.e. splitting the digits and then next find the of integers
          }
          on=n;
          while (on!= 0) {
           rem = on % 10;
            sum =(int) (sum+ Math.pow(rem, digit));
            on /= 10;   //finding number is armstrong or not. 
          }
    
          if (sum == n) {
            System.out.print(n + " ");  //if the sum of cube of digits is equal to the number, it is armstrong.
          }
        }
      }
    }
   
    
    