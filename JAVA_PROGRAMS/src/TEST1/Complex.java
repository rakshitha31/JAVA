package TEST1;
import java.util.*;
public class Complex {
	float r1=0,r2=0,c1=0,c2=0;
	static Scanner sc=new Scanner(System.in);
	Complex(){
		System.out.println("Enter two numbers in the form a+ib");
		this.r1=sc.nextInt();
		this.c1=sc.nextInt();
		this.r2=sc.nextInt();
		this.c2=sc.nextInt();
	}
	void add() {
		float real,img;
		real=(r1+r2);
		img=c1+c2;
		System.out.println("Sum is "+real+"+"+"i"+img);
	}
	void subtract() {
		float real,img;
		real=r1-r2;
		img=c1-c2;
		System.out.println("Difference is "+real+"+"+"i"+img);
	}
	void multiply() {
		System.out.println("Product is "+(((r1*r2)-(c1*c2))+"+"+"i"+((r1*c2)+(r2*c1))));
	}
	public static void main(String[] args) {
		Complex c=new Complex();
		c.add();
		c.subtract();
		c.multiply();
	}
}
