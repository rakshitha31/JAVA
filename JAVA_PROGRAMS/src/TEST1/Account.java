package TEST1;
import java.util.*;

public class Account {
	static int acc_no=0,ph_no;
	static String name;
	static float balance_amt;
	static Scanner sc=new Scanner(System.in);
	void get_input() {
		System.out.println("Enter acc_no");
		acc_no=sc.nextInt();
		System.out.println("Enter ph_no");
		ph_no=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter salary");
		balance_amt=sc.nextInt();
	}
	void Deposit() {
		float dep;
		System.out.println("How much u wanna deposit yo?");
		dep=sc.nextFloat();
		balance_amt+=dep;
		System.out.println("Balance is: "+balance_amt);
	}
	void Withdraw() {
		float with;
		if(balance_amt<=1000) {
			System.out.println("Not enough money!");
		}
		else {
			System.out.println("How much u wanna withdraw");
			with=sc.nextFloat();
			balance_amt-=with;
			System.out.println("Balance is: "+balance_amt);
		}
	}
	void display() {
		System.out.println("NAME:: "+name);
		System.out.println("Account number:: "+acc_no);
		System.out.println("Phone number:: "+ph_no);
		System.out.println("Current balance:: "+balance_amt);
	}
	public static void main(String[] args) {
		Account obj=new Account();
		int ch=0;
		while(ch!=5) {
			System.out.println("Enter 1 for input, 2 for deposit, 3 for withdraw ,4 for details 5 to exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:obj.get_input();break;
			case 2:obj.Deposit();break;
			case 3:obj.Withdraw();break;
			case 4:obj.display();break;	
			}				
		}
	}

}
