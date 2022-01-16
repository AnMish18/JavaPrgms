//qn 1
//Anwesha Mishra-11
class Parent{
     public void methodA(){
      System.out.println("This is parent class");
    }
  }
  
  class Child extends Parent{
     public void methodB(){
      System.out.println("This is child class");
    }
  }
  
  class Driver{
    public static void main(String[] args){
      Parent a = new Parent();  //method of parent by object of parent , upcasting
      Child b = new Child();   //method of child by object of child 
      a.methodA();
      b.methodB();
      b.methodA();  //method of parent by object of child , downcasting
    }
  }		