//Q1-Write a Java program to create an ArrayList. The program should able to replace a specified element with a new value.
//Anwesha Mishra-11
import java.util.ArrayList;

class Q1nine {
   public static void main(String[] args) {
      ArrayList<String> array = new ArrayList<String>();
      array.add("Java");
      array.add("Python");
      array.add("C#");
      array.add("BASIC");
      System.out.println(" The arraylist before replacing is: "+ array);
      array.set(3, "Fortan");
      System.out.print("The arraylist after replacing is: "+ array);
   }
}