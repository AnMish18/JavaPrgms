//3-Write a Java program to compare two HashSets and using the common elements create a TreeSet.
//Anwesha Mishra-11
import java.util.*;
 class Q3nine {
  public static void main(String[] args) {
        HashSet<String> first = new HashSet<String>();
          first.add("Jonah");
          first.add("Zach");
          first.add("Corbyn");
          first.add("Daniel");
          first.add("Jack");

          HashSet<String>second = new HashSet<String>();
          second.add("Jonah");
          second.add("Jack");
          second.add("Corbyn");
          second.add("Niall");
          second.add("Jack");
          TreeSet<String>result = new TreeSet<String>();
         for (String e : first){
             if(second.contains(e)){
              result.add(e);
             }
             System.out.println(result);            
          }      
     }
}
