package TEST1;
import java.util.Scanner;
public class P1 {
	 String name;
     String edu;
     double salary;
     int exp;
     int num_loan;
     double loan_amt;
 P1(String nam,String ed,double s,int ep,int nl,double loan_am)
 {
     name=nam;
     edu=ed;
     salary=s;
     exp=ep;
     num_loan=nl;
     loan_amt=loan_am;
 }
    boolean isEligible(double amt,double sal)
    {
     if(amt>sal)
        return false;
     else
        return true; 
    }
    double taxPay(double sal)
    {
    	if(sal>=250000 && sal<=500000)
       	 return(0.05*sal);
       	 if(sal>500000 && sal <=1000000)
       		return(0.2*sal);
       	 if(sal>1000000)
       		return(0.3*sal);
    }
    boolean isProm(int exp)
    {
        if(exp>3)
            return true;
        else
            return false;
    }
    void display(String n,String e,double sal,int ex)
    {
        System.out.println("Name : "+n+"\nEducation : "+e+"\nSalary : "+sal+"\nExperience : "+ex+"no. of loans : "+num_loan+"loan amt : "+loan_amt);
    }
   public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        
         int n,per,i,ch;
         double tax;
         boolean b1,b2;
         
         String name;
         String edu;
         double salary;
         int exp;
         int num_loan;
         double loan_amt;
         
        System.out.println("Enter no of persons");
        per=sc.nextInt();
        
        P1 obj[] = new P1[per];
        for(i=0;i<per;i++)
        {
            System.out.println("Enter details for person " +per); 
            System.out.println("Name");
            name=sc.nextLine();sc.nextLine();
            System.out.println("Edu");
            edu=sc.nextLine();
            System.out.println("Sal");
            salary=sc.nextDouble();
            System.out.println("Exp");
            exp=sc.nextInt();
            System.out.println("No of loans");
            num_loan=sc.nextInt();
            System.out.println("Loan amt");
            loan_amt=sc.nextDouble();
            
            obj[i] = new P1(name,edu,salary,exp,num_loan,loan_amt);
        }
        n=0;
        ch=n;
        while(ch!=5)
        {
            System.out.println("Select person");
            System.out.println("Enter 5 to exit");
        
            ch=sc.nextInt();
        
        while(n!=5)
        {
            System.out.println("Enter options\n1>For Loan Eligiblity\n2>For tax to be paid\n3>For Promotion Eligiblity\n4>For Display\n5>For exit");
        n=sc.nextInt();
        
        switch(n)
        {
            case 1: b1=obj[ch].isEligible(obj[ch].loan_amt,obj[ch].salary);
                    System.out.println(b1);
            break;
            case 2: tax=obj[ch].taxPay(obj[ch].salary);
                    System.out.println(tax);
            break;
            case 3: b2=obj[ch].isProm(obj[ch].exp);
                    System.out.println(b2);
            break;
            case 4: obj[ch].display(obj[ch].name,obj[ch].edu,obj[ch].salary,obj[ch].exp);
            break;
        }
        }
        }
    
    }  
}
