package recur;
import java.util.*;

public class Bank {
	int ac1,ac2,ac3;
	static int balance;
	static int charity;
	static Scanner sc=new Scanner(System.in);
	Bank(){
		int ac1=0, ac2=0, ac3=0;
		this.ac1=ac1;
		this.ac2=ac2;
		this.ac3=ac3;
		
	}
	void getDetails() {
		int i=0;
		while(i<3) {
		Scanner k=new Scanner(System.in);
		System.out.println("Enter your account number");
		this.ac1=k.nextInt();
		this.ac2=k.nextInt();
		this.ac3=k.nextInt();
		}
	}
	
	void Deposit() {
		int amt=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount u want to deposit");
		amt=sc.nextInt();
		balance+=amt;
		System.out.println("How much money do u want to donte for the charity?");
		this.charity=sc.nextInt();
		balance=balance-charity-20;
	}
	
	
	void Withdraw() {
		int mon=0;
		if(balance<1000)
			System.out.println("Low balance");
		else {
		Scanner s=new Scanner(System.in);
		System.out.println("How much do u want to withdraw");
		mon=s.nextInt();
		balance-=(mon+20);
		System.out.println("How much money do u want to donte for the charity?");
		this.charity=s.nextInt();
		balance-=charity;
		}
	}
	void Account() {
		
	}
	void Display() {
		System.out.println("your ac number is"+this.ac1+"Your balance is"+balance );
		System.out.println("your ac number is"+this.ac2+"Your balance is"+balance );
		System.out.println("your ac number is"+this.ac3+"Your balance is"+balance );
	}
	
	public static void main(String[] args) {
		Bank obj=new Bank();
		int choice=0;
		System.out.println("1 for deposit, 2 for withdraw, 3 for display");
		choice=sc.nextInt();
		//while(choice!=4)
		switch(choice) {
		case 1:obj.Deposit();break;
		case 2:obj.Withdraw();break;
		case 3:obj.Display();break;
		default:System.out.println("Enter correct choice");
		}
		System.out.println("The amount donated to charity is"+charity);
	}
}
