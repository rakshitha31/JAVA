package recur;

public class Personal {
	String name,education;
	int age,experience,no_loan,loan_amt;
	double salary,basic,da,hra;
	Personal(String n,String ed,int a,int ex,double sal,int num,int amt){
		name=n;education=ed;age=a;salary=sal;experience=ex;no_loan=num;
		loan_amt=amt;
	}
	public static void main(String[] args) {
	Personal p=new Personal("Rashi","BE",22,3,90000,1,50000);
	p.display();
	p.isEligible();
	p.taxPay();
	p.isEligiblePromotion();

	}
	void isEligible() {
		System.out.println("Your salary is"+salary);
		if(salary>5000) {
			System.out.println("Is eligible to pay tax");
		}
		else {
			System.out.println("Not eligible to pay tax");
		}
		
	}
	void taxPay() {
				if(salary<=10000) {
					System.out.println("You need to pay a tax of"+(0.05*salary));
				}
				else if(salary>=50000) {
					System.out.println("YOu need to pay a tax of "+(0.1*salary));
				}
				else if(salary>=100000) {
				System.out.println("You need to pay a tax amount of"+(0.15*salary));
					}
				}
	void display() {
		System.out.println("The details of the employee are");
		System.out.println("Name is: "+name+"\n"+" Education: "+education+"\n"+"Number of years of experience: "+experience);
		System.out.println("Basic: "+(0.85*salary));
		System.out.println("DA: "+(0.05*salary));
		System.out.println("HRA: "+(0.1*salary));
		System.out.println("Gross Salary is: "+salary);
	}
	void isEligiblePromotion() {
		if(experience>5) {
			System.out.println("Is eligible for promotion");
		}
		else
			System.out.println("Try after "+(5-experience)+" years for promotion");
	}
}


