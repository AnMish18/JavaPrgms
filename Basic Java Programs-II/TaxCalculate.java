import java.util.Scanner;

public class TaxCalculate {
    public static void main(String args[]){
        double i,tax=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Income of the person is: ");
	i=sc.nextDouble();
	 double tax_inc=i-150000;
	if(tax_inc<=150000)
		tax=0;
	else if(tax_inc>=150001 && tax_inc<300000)
		tax= 0.1*(tax_inc-150000);
	else if(tax_inc>=300001 && tax_inc<500000)
		tax= 0.2*(tax_inc-300001);
	else 
		tax= 0.3*(tax_inc-500001);
	System.out.println("Income tax amount is "+tax);
	}

    }
    

