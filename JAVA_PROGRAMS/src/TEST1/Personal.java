//To demonstrate array of objects using a tax calulate system
package TEST1;
import java.util.*;
public class Personal {
	static Scanner sc=new Scanner(System.in);
	 static String name;
     static String edu;
     static double salary;
     static int exp;
     static int num_loan;
     static double loan_amt;
     Personal(String na,String ed,int ex,int num,double sal,double la){
    	 name=na;
    	 edu=ed;
    	 exp=ex;
    	 num_loan=num;
    	 loan_amt=la;
    	 salary=sal; 
     }
     void isEligible() {
    	 if(salary>=250000) {
    		 System.out.println("Is eligible");}
    		 else
    			 System.out.println("Not eligible"); 	 
     }
     void taxPay() {
    	 if(salary>=250000 && salary<=500000)
    	 System.out.println("Tax amount is: "+(0.05*salary));
    	 if(salary>500000 && salary <=1000000)
    		 System.out.println("Tax amount is: "+(0.2*salary));
    	 if(salary>1000000)
    		 System.out.println("Tax amount is: "+(0.3*salary));
     }
    void isEligiblePromotion(){
    	 if(exp>7) {
    		 System.out.println("Yup, u get promotion");
    	 }
    	 else
    		 System.out.println("Nope sorry");
     }
    void display() {
    	System.out.println("Name is: "+name+"\nEducation is: "+edu+"\nSalary is: "+salary+"\nNo of loans is"+num_loan);
    }
    public static void main(String[] args) {
    	int n=0;
    	System.out.println("How many people?");
    	n=sc.nextInt();
    	Personal[] obj=new Personal[100]; 
    	for(int i=0;i<n;i++) {
    		System.out.println("Enter details of person "+i);
    		 System.out.println("Name: ");
    		 name=sc.next();
             System.out.println("Education: ");
             edu=sc.next();
             System.out.println("Salary: ");
             salary=sc.nextDouble();
             System.out.println("Experience: ");
             exp=sc.nextInt();
             System.out.println("Number of loans: ");
             num_loan=sc.nextInt();
             System.out.println("Loan amount: ");
             loan_amt=sc.nextDouble();
             obj[i]=new Personal(name,edu,exp,num_loan,loan_amt,salary);
    	}
    	int ch=0,per=0;
    	while(ch!=5) {
    		System.out.println("Enter the number of person to display details");
    		per=sc.nextInt();
    		System.out.println("Enter 1 for eligible loan ,2 for tax amount, 3 for promotion eligibility,4 to display, 5 to exit");
    		ch=sc.nextInt();
    		switch(ch) {
    		case 1:obj[per].isEligible();break;
    		case 2:obj[per].taxPay();break;
    		case 3:obj[per].isEligiblePromotion();break;
    		case 4:obj[per].display();break;
    		default:System.out.println("Terminating");
    		}
    		
    	}
    	
    }

}
