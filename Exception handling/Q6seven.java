//qn 6
//Anwesha Mishra-11
import java.util.*;

class Account {
  String accName;
  int acc_no;
  double ac_bal;

  Account() {
    this.accName = null;
    this.acc_no = 0;
    this.ac_bal = 0.0;
  }

  Account(String accName, int acc_no, double ac_bal) {
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

  void transfer(Account acc1, Account acc2, int amt) throws MinimumBalanceException {
    if (acc1.ac_bal - amt < 500)
      throw new MinimumBalanceException();
    else {
      acc1.ac_bal = acc1.ac_bal - amt;
      acc2.ac_bal = acc2.ac_bal + amt;
      this.displayAcc(acc1);
      this.displayAcc(acc2);
    }
  }

  void displayAcc(Account acc) {
    System.out.println("Account Holder Name : " + acc.accName);
    System.out.println("Account Number : " + acc.acc_no);
    System.out.println("Account Balance : " + acc.ac_bal);
  }
}

class MinimumBalanceException extends Exception {
  MinimumBalanceException() {
    super();
  }
}

class Driver {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String accName;
    int acc_no;
    double ac_bal;
    int choice = 0, amount;
    System.out.println("------Account Details of first account------");
    System.out.println("Name: ");
    accName = in.next();
    System.out.println("Account Number: ");
    acc_no = in.nextInt();
    Account acc1 = new Account(accName, acc_no, 500);
    System.out.println("------Account Details of second account------");
    System.out.println("Name: ");
    accName = in.next();
    System.out.println("Account Number: ");
    acc_no = in.nextInt();
    Account acc2 = new Account(accName, acc_no, 500);

    while (choice != 4) {
      System.out.println("1: Deposit 2: Withdraw 3: Transfer 4:Exit");
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
            System.out.println("Enter amount to transfer");
            amount = in.nextInt();
            acc1.transfer(acc1, acc2, amount);
            break;
          case 4:
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