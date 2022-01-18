//qn 1
//Anwesha Mishra-11
import java.util.*;
class ChildThread extends Thread
{
	int m,n;
	ChildThread(int m, int n)
	{
		this.m = m;
		this.n = n;
	}
	public void run()
	{
		int i;
		System.out.print("Even numbers are : ");
		for(i=m;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"\t");
			}
		}
	}
}
class Q1eight extends Thread
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range");
		int m = in.nextInt();
		int n = in.nextInt();
		ChildThread t1 = new ChildThread(m,n);
		int i;
		System.out.print("Odd numbers are : ");
		for(i=m;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		t1.start();
	}
}