package recur;
import java.util.*;

public class account {
 int acc_no;
 double ph_no;
 float balance;
 String name;
 public void getinput() {
	 System.out.println("Enter your name");
	 Scanner s=new Scanner(System.in);
	 this.name=s.nextLine();
	 System.out.println("Enter your acc_no");
	 this.acc_no=s.nextInt();
	 System.out.println("Enter your phone number");
	 this.ph_no=s.nextDouble();
	 System.out.println("Enter your balance");
	 this.balance=s.nextFloat();
 }
 public void Deposit() {
	 System.out.println("Enter amount to be deposited: ");
	 Scanner d=new Scanner(System.in);
	 float dep=d.nextFloat();
	 this.balance+=dep;
	 System.out.println(this.balance);
 }
 public static void main(String[] args) {
	 account ac=new account();//creating an instance for class account
	 ac.getinput();
	 ac.Deposit();
 }
}

