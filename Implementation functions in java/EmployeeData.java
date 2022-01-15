/*Write a program that would print the information (name, year of joining, salary, address)
 of three employees by creating a class named 'Employee'.
 Anwesha Mishra -11 
 qn 5*/
import java.util.Scanner;
class Employee
{
String name,address;
float salary; 
int year;
public void getData(String name, String address, float salary,int year)
 {
   this.name = name;  //name of instance varaible and parameter same hence this is used
   this.address = address;
   this.salary = salary;
   this.year = year;          
}
public void printData()
{
  System.out.println(name  + "\t\t" + address + "\t\t" + salary + "\t\t" +year );  
}
}
class EmployeeData{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   String [] name = new String[3];
   int [] year = new int[3];   //3 denotes 3 employees
   float [] salary = new float [3];
   String [] address = new String[3];
     for (int i = 0; i <3; i++)  //for array of objects
     {  
       System.out.println("\t Enter Employee's Info");
       System.out.println("Name: ");
       name[i]=sc.nextLine();
       System.out.println("Year of Joining: ");
       year[i]=sc.nextInt();
       System.out.println("Enter Salary: ");
       salary[i]=sc.nextFloat();
       sc.nextLine();
       System.out.println("address: ");
       address[i]=sc.nextLine();        }

      Employee em1 = new Employee(); 
      em1.getData(name[0],address[0],salary[0], year[0]);
      Employee em2 = new Employee();
      em2.getData(name[1],address[1],salary[1], year[1]);
      Employee em3 = new Employee(); 
      em3.getData(name[2],address[2],salary[2], year[2]);
      System.out.println("Name \tAddress \tSalary   \tYear");
        em1.printData();
        em2.printData();
        em3.printData();

     }
}


