package TEST1;
import java.util.*;
public class Stack {
	int size,top;
	int[] s;
	static Scanner sc=new Scanner(System.in);
	Stack(){
		this.size=5;this.top=-1;
		s=new int[this.size];
	}
	void push() {
		int i;
		if(top==(size-1))
			System.out.println("Stack overflow");
		else {
			System.out.println("Ente an element");
			i=sc.nextInt();
			s[++top]=i;
		}
	}
	void pop() {
		if(top==-1)
			System.out.println("Stack underflow");
		else {
			System.out.println("The deleted element is "+s[top]);
			top-=1;
		}
	}
	void display() {
		int k;
		if(top==-1)
			System.out.println("Stack underflow");
		else {
			for(k=top;k>0;k--) {
				System.out.println(s[k]);
			}
		}
	}
	public static void main(String[] arg) {
		Stack obj=new Stack();
		int ch=0;
		while(ch!=4) {
			System.out.println("Enter 1 for push 2 for pop 3 to display 4 to exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:obj.push();break;
			case 2:obj.pop();break;
			case 3:obj.display();break;
			}
		}
	}
}
