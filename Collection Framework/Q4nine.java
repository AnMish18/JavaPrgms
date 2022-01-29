//4-Write a Java program to retrieve and remove the element of a tree set which are less than a specified value.
//Anwesha Mishra-11

import java.util.*;

public class Q4nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(40);
        tree.add(50);
		tree.add(60);
        System.out.print(tree);

        int i=0;
        System.out.println("Remove element: (Y/N): ");
        String choose = sc.next();
        if(choose.equals("Y")){
            System.out.println("Item to remove is : ");
            sc.nextLine();
            int element = sc.nextInt();
            i=element;
            boolean value = tree.remove(element);
            System.out.println("Is "+element+" removed?: "+value);
            System.out.println(tree);
        }

        System.out.println("Keep the element back in set (Y/N): ");
        choose = sc.next();
        if(choose.equals("Y")){
            tree.add(i);
            System.out.println(tree);
        }
    }
}