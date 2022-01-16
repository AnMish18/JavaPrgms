//qn 5
//Anwesha Mishra-11
class Employee{
    String empName;
    int empId,empSal;

Employee(String empName,int empId, int empSal){
    this.empName=empName;
    this.empId=empId;
    this.empSal=empSal;
}
public void display(){
    System.out.println("Name: "+ empName + "  Employee Id: " + empId + "  employee Salary " + empSal);
}
}
class Member extends Employee{
    int bonus;
    Member(String empName, int empId, int empSal,int bonus){
        super(empName, empId, empSal);
        this.bonus=bonus;
    }
    public void displayamt(){
        bonus=empSal+bonus;
        System.out.println("The salary after bonus is: "+bonus);
    }
}
class Data{
    public static void main(String []args){
        Member m=new Member("Anwesha",1000,2000,100);
        m.display();
        m.displayamt();
    }
}
