import java.util.*;
    class Employee{
        String empName;
        int empNo,basic;
    Employee(String empName,int empNo,int basic){
       this.empName=empName;
       this.empNo=empNo;
       this.basic=basic;
    }
    double calGross(){
        return 0.2*basic+0.1*basic+basic;
    }
    void show(){
        System.out.println("name "+empName+"Number "+"Basic Salary "+basic);
    }
}
class Q8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter enployee's name");
        String empName=sc.nextLine();
        System.out.println("Enter number and basic salary of employee ");
        int empNo=sc.nextInt();
        int basic=sc.nextInt();
        Employee e=new Employee(empName,empNo,basic);
        System.out.println("employee Details");
        e.show();
        System.out.println("Gross salary ");
        System.out.println(e.calGross());

    }
}
