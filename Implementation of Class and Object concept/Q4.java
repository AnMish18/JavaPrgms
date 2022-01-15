/*qn 4
Anwesha Mishra-11*/
import java.util.Scanner;

class Employee{
    int empId;
    String empName;
    String designation;
    Employee(int id , String name , String des){  //consturctor for instance var declaration
        empId = id;
        empName = name;
        designation = des;
    }
    public void display(int i){
        System.out.println("----Employee Details----");
        System.out.println("Employee Id " + empId);
        System.out.println("Employee Name  " + empName);
        System.out.println("Designation  " + designation);
        System.out.println(" ");
    }
    
}
class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID:~ ");
        int ide = sc.nextInt();
        System.out.print("Name of Employee:~ ");
        String n = sc.next();
        System.out.print("Designation:~ ");
        String de = sc.next();
        Employee e1 = new Employee(ide,n,de);
        System.out.print("ID:~ ");
        int ide1 = sc.nextInt();
        System.out.print("Name of Employee:~ ");
        String n1 = sc.next();
        System.out.print("Designation:~ ");
        String de1 = sc.next();
        Employee e2 = new Employee(ide1,n1,de1);
        e1.display(1);
        e2.display(2);


    }
}