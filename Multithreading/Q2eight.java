//qn 2
//Anwesha Mishra-11
import java.util.*;
class Q2eight {
	public static void main(String[] args) {
		Runnable r1 = new Runnable1();
		Runnable r2 = new Runnable2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
class Runnable1 implements Runnable {
	public void run() {
		double x=144;
        double z=x*x;
        System.out.println(z);
}
}

class Runnable2 implements Runnable {
	public void run() {
        int n=144;
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println(sum);
}
}
