//Qn 7
//Anwesha Mishra-11
import java.util.*;
class AccTrial
{
	int accNum;
	String Name;
	double balance;
	AccTrial()
	{
		this.accNum = 0;
		this.Name = "Default Name";
		this.balance = 0.0;
	}
	AccTrial(int accNum, String Name, double balance)
	{
		this.accNum = accNum;
		this.Name = Name;
		this.balance = balance;
	}
	void withdraw(double amt)
	{
		if(amt<=balance)
			this.balance = balance-amt;
		else
			System.out.println("Insufficient Balance");
		this.display();
	}
	void dep(double amt)
	{
		this.balance = balance+amt;
		this.display();
	}
	void display()
	{
		System.out.println("Account Number : "+accNum);
		System.out.println("Account Holder Name : "+Name);
		System.out.println("Account Balance : "+balance);
	}
}
class Q7
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int accNum, choose=0, amt;
	    String Name;
	    double balance;
		System.out.println("Enter Details");
		System.out.println("Account Number");
		accNum = in.nextInt();
		System.out.println(" Account Holder's Name");
		Name = in.next();
		System.out.println(" Account Balance");
		balance = in.nextDouble();
		AccTrial b = new AccTrial(accNum, Name, balance);
		// System.out.println("Enter the amount to be deposited or withdrawn");
		// amt=in.nextInt();
		// System.out.println("enter 0 for withdraw, 1 for deposit, any other for exit");
		// if(choose==0){
		// 	b.withdraw(amt);
		// }
		// else if(choose==1){
		// 	b.dep(amt);
		// }
		// else{
		// 	return;
		// }
		while(choose != 3)
		{
		System.out.println("Enter 0 to withdraw  Enter 1 to dep  Enter 2 to exit");
		choose = in.nextInt();
		switch(choose)
		{
			case 0: System.out.println("Enter the amt");
			        amt = in.nextInt();
			        b.withdraw(amt);
			        break;
			case 1:System.out.println("Enter the amt");
			       amt = in.nextInt();
			       b.dep(amt);
			       break;
			case 2:
			        return;
			default: System.out.println("Please enter correct number");
		}
		}
	}
}