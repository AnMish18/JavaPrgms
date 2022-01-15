/*Print the sum of two complex numbers by creating a class named 'Complex’ whose real and imaginary parts are entered by user.
Anwesha Mishra-11
qn 4*/
import java.util.*;
class Complex{
  int real;
  int imag;
  public Complex(int real, int imag){   
    this.real = real;
    this.imag = imag;
  }
    public static Complex add(Complex a, Complex b){
    return new Complex((a.real+b.real),(a.imag+b.imag));  //the value to be returned is allocated a memory space
  }
  public void print(){
    if(real == 0 && imag!=0){
      System.out.println(imag+"i");   //conditions 
    }
    else if(imag == 0 && real!=0){
      System.out.println(real);
    }
    else{
      System.out.println(real+"+"+imag+"i");
    }
  }

}

class ComplexNum{
  public static void main(String[] args){
    int a,b,f,g;
    Scanner qc=new Scanner(System.in);  
    System.out.println("Enter the real and complex of first");
    a=qc.nextInt();
    b=qc.nextInt();
    System.out.println("First complex :"+ a +"+"+b+"i");
    System.out.println("Enter the real and complex of second");
    f=qc.nextInt();
    g=qc.nextInt();
    System.out.println("First complex :"+ f+"+" +g+"i");
    Complex c = new Complex(a,b);
    Complex d = new Complex(f,g);

    Complex e = Complex.add(c,d);
    e.print();
  }
}				
