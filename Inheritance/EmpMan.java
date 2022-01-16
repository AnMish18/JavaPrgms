//qn 2
//Anwesha Mishra-11
 class Member {
     String name;
     int age;
     String ph;
     String address;
     double salary;

 Member(String name, int age, String ph, String address, double salary) {
        this.name = name;
        this.age = age;
        this.ph = ph;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("The salary of members: " + salary);
    }
    public void display(){
        System.out.println("Name: "+name+ " Age: "+age+ " Phone Number: "+ph+ " Address: "+address +" Salary: "+salary);
    }
}

  class Employee extends Member {
        String spez;
   Employee(String name, int age, String ph,String address, double salary, String spez) {
        super(name, age, ph, address, salary);    //super method to call the parent class objs
        this.spez = spez;
    }
}

 class Manager extends Member{
     String dept;
 Manager(String name, int age, String ph,String address, double salary, String dept) {
        super(name, age, ph, address, salary);  //denote the var of parent class
        this.dept = dept;
    }
}

public class EmpMan{
    public static void main(String[] args) {
        Employee e = new Employee("Anwesha", 18, "7000121212", "Riverdale", 40000, "Front end");
        Manager m = new Manager("Rahul", 19, "987654321", "New-hamisphere", 55000, "Back end");
        e.display();
        m.display();
        e.printSalary();
        m.printSalary();
    }
}
