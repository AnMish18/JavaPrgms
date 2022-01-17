//qn 4
//Anwesha Mishra-11
public class Q4seven {  
       public static void main(String[] args) {  
          try{    
                int arr[]=new int[8];    
                System.out.println(arr[10]);  
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithematic Exception in the code");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("Insufficient Array index in the code");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("No specified exception executed hence parent exception");  
                  }             
               System.out.println("no error");    
    }  
}  
