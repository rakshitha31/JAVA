//Check for prime number

package TEST1;
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
	int i,m=0,flag=0;   
	Scanner sc=new Scanner(System.in);
	  int n;
	  System.out.println("Enter number");
	  n=sc.nextInt();
	  m=n/2;    
	  for(i=2;i<=m;i++){    
	   if(n%i==0){    
	   System.out.println("Number is not prime");    
	   flag=1;    
	   break;    
	   }    
	  }    
	  if(flag==0)    
	  System.out.println("Number is prime");    
	}  
	}
