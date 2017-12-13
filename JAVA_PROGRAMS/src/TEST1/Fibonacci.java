package TEST1;
import java.util.*;
public class Fibinacci {
	public static void main(String[] args) {
	int num,a=0,b=1,c;
	System.out.println("Enter number of elements you want");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	System.out.print(a+" "+b);
	for(int i=2;i<num;i++) {
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
}
}
