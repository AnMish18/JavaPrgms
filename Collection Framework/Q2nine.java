//2-Write a Java program to create two linked lists containing different colours (as strings) and 
//compare the two linked lists to check whether both containing the same elements or not.
//Anwesha Mishra-11
import java.util.*;
 class Q2nine {
  public static void main(String[] args) {
   LinkedList<String> first= new LinkedList<String>();
          first.add("Red");
          first.add("Burgundy");
          first.add("Black");
          first.add("Maple");
          first.add("Crimson");

          LinkedList<String> second= new LinkedList<String>();
          second.add("Cyan");
          second.add("Green");
          second.add("Black");
          second.add("Maple");
          second.add("Crimson");

          LinkedList<String> compare_ll = new LinkedList<String>();
          for (String i : first)  //iterating each value of first ll and comparing at each instance with the second
             compare_ll.add(second.contains(i) ? "Similar color" : "Different color"); //if second ll contains, returns similar
          System.out.println(compare_ll);         
     }
}
