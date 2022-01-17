//qn 5
//Anwesha Mishra-11
import java.util.*;

class BankAcc {
  String accName;
  int acc_no;
  double ac_bal;

  BankAcc() {
    this.accName = null;
    this.acc_no = 0;
    this.ac_bal = 0.0;
  }

  BankAcc(String accName, int acc_no, double ac_bal) {
    this.accName = accName;
    this.acc_no = acc_no;
    this.ac_bal = ac_bal;
  }

  void deposit(int amt) {
    this.ac_bal = ac_bal + amt;
    this.displayAcc(this);
  }

  void withdraw(int amt) throws MinimumBalanceException {
    if (ac_bal - amt < 500)
      throw new MinimumBalanceException();
    else
      this.ac_bal = ac_bal - amt;
    this.displayAcc(this);
  }
  void displayAcc(BankAcc acc) {
    System.out.println("BankAcc Holder Name : " + acc.accName);
    System.out.println("BankAcc Number : " + acc.acc_no);
    System.out.println("BankAcc Balance : " + acc.ac_bal);
  }
}

class MinimumBalanceException extends Exception {
  MinimumBalanceException() {
    super();
  }
}
class Transaction {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      String accName;
      int acc_no;
      double ac_bal;
      int choice = 0, amount;
      System.out.println("------BankAcc Details of first BankAcc------");
      System.out.println("Name: ");
      accName = in.next();
      System.out.println("BankAcc Number: ");
      acc_no = in.nextInt();
      BankAcc acc1 = new BankAcc(accName, acc_no, 500);
      System.out.println("------BankAcc Details of second BankAcc------");
      System.out.println("Name: ");
      accName = in.next();
      System.out.println("BankAcc Number: ");
      acc_no = in.nextInt();
      BankAcc acc2 = new BankAcc(accName, acc_no, 500);
      while (choice != 3) {
        System.out.println("1: Deposit 2: Withdraw 3:Quit");
        choice = in.nextInt();
        try {
          switch (choice) {
            case 1:
              System.out.println("Enter the Acc No, and amt to deposit");
              acc_no = in.nextInt();
              amount = in.nextInt();
              if (acc_no == acc1.acc_no)
                acc1.deposit(amount);
              else
                acc2.deposit(amount);
              break;
            case 2:
              System.out.println("Enter Acc No, and amt to withdraw");
              acc_no = in.nextInt();
              amount = in.nextInt();
              if (acc_no == acc1.acc_no)
                acc1.withdraw(amount);
              else
                acc2.withdraw(amount);
              break;
              case 3:
            return;
          default:
            System.out.println("Please  choose the correct choice ");
        }
      } catch (MinimumBalanceException e) {
        System.out.println(e);
      }
    }

  }
}