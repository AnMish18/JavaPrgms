 //qn 2
 //Anwesha Mishra-11
 interface Calculator {

    public int add(int a, int b);

    public int sub(int a, int b);

    public int mul(int a, int b);
          
    public int div(int a,int b);
    }    
    class DemoCalculator implements Calculator {

        public int a;
        public int b;
        @Override
        public int add(int a, int b) {
            System.out.println("Addition of " + a + " and " + b + "=" + (a+b));
            return a + b;
            }
        @Override        
        public int div(int a, int b) {
            System.out.println("Division of "+ a +" and " + b+ "="+ (a/b));
            return a/b;
        }
        @Override
        public int sub(int a, int b) {
            System.out.println("Subtraction of "+ a +" and " + b + "="+ (a-b));
            return a-b;
        }
        @Override
        public int mul(int a, int b) {
            System.out.println("Multiplication of "+ a +" and " + b+ "="+ (a*b));
            return a*b;  
         
        }
    }

    public class DriverCheck{
        public static void main(String []args){
            Calculator c= new DemoCalculator();
            c.add(2,3);
            c.sub(3,1);
            c.mul(2,3);
            c.div(15,3);
        }
    }

        