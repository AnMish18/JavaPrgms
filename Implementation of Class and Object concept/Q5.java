/*qn 5
Anwesha Mishra-11 */
class Student{
    int regNo;
    float cgpa;
    String stdName,branch;

    Student(){    //default constructor 
        regNo=202001;
        cgpa=8.4f;
        stdName="Rahul";
        branch="Chemical";
    }
    Student(int n,float score,String name,String brn){
        regNo=n;
        cgpa=score;
        stdName=name;
        branch=brn;
    }

    void show(){
        System.out.println("Registered Number: "+regNo);
        System.out.println("Branch: "+branch);
        System.out.println("Name of the Student: "+stdName);
        System.out.println("CGPA: "+cgpa);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Student a= new Student();
        Student b = new Student(202002,7.6f,"Priya","Mechanical");
        a.show();
        b.show();
    }
}
