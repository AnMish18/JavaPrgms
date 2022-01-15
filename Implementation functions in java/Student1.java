/*Write a program to Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
Assign the value of roll_no as '20' and that of name as "John" by creating an object of the class Student.
Anwesha Mishra-11
qn 2*/
class Student{
    String name;
    int roll_no;
  }
  
  class Student1{
    public static void main(String[] args){
      Student sm = new Student(); //object sm is used to access the variables in Student class through Student() constructor
      sm.name = "John";  //invoking the name varibale to Student1 class
      sm.roll_no = 2;
      System.out.println("Name: "+sm.name+" roll number: "+sm.roll_no);
    }
  }	