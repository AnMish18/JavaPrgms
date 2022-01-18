//qn 3
//Anwesha Mishra-11
import java.util.Scanner;
class Global {
    public static int R[];
    Global(int size) {
        R = new int[size];
    }
    public static synchronized void update(int index, int n) {
        R[index] = n;
    }
}
class FirstChild extends Thread {
    int arr1[], arr2[], size;
    FirstChild(int n1[], int n2[], int s) {
        arr1 = n1;
        arr2 = n2;
        size = s;
        start();
    }
    public void run() {
        try {
            for (int i = 0; i < size; i += 2) {
                Global.update(i, arr1[i] * arr2[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class SecondChild extends Thread {
    int arr1[], arr2[], size;
    SecondChild(int n1[], int n2[], int s) {
        arr1 = n1;
        arr2 = n2;
        size = s;
        start();
    }
    public void run() {
        try {
            for (int i = 1; i < size; i += 2) {
                Global.update(i, arr1[i] * arr2[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Q3eight {
    public static void main(String args[]) { 
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n The size of both arrays: : "); 
        int l = sc.nextInt();
        int arr1[] = new int[l];
        int arr2[] = new int[l];
        System.out.print("\n The elements of first array are : "); 
        for (i = 0; i < l; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("\n EThe elements of second array are : "); 
        for (i = 0; i < l; i++) {
            arr2[i] = sc.nextInt();
        }
        Global g = new Global(l);
        FirstChild c1 = new FirstChild(arr1, arr2, l);
        SecondChild c2 = new SecondChild(arr1, arr2, l);
        try {
            c1.join();
            c2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("\n multiplication of two arrays : ");
        for (i = 0; i < l; i++) {
            System.out.print(Global.R[i] + " ");
        }
    }
}