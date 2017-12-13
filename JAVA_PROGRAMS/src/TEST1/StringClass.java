//To demonstratebasic string functions

package TEST1;
import java.util.Scanner;
public class StringClass {
	public static void main(String[] args) {
		String st;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		st=sc.nextLine();
		System.out.println("Enter number n");
		int n=sc.nextInt();
		System.out.println("Enter number m");
		int m=sc.nextInt();
		String st1=st.substring(n,n+m);
		System.out.println("Extracted string is "+st1);
		System.out.println("Enter string to be searched");
		st1=sc.next();
		int count=0,idx=0;
		while((idx=st.indexOf(st1,idx))!=-1) {
			idx++;count++;
		}
		System.out.println("Count of "+st1+"is"+count);
		System.out.println("Enter string to be replaced");
		st1=sc.next();
		String stt=st.replaceAll(st1, "hello");
		System.out.println(stt+" is the string  after replacement");
		char[] charArray=st.toCharArray();
		int length=charArray.length;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length-1;j++) {
				if(charArray[j]<charArray[i]) {
					char temp=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=temp;
				}
			}
		}
		st1=String.valueOf(charArray);
		System.out.println("Sorted array is "+st1);
		String st3=new String("Hello");
		String st2=new String();
		System.out.println("Enter string to be compared");
		st2=sc.next();
		int p=st3.compareTo(st2);
		if(p==0) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Result of comparison is "+p);}
		
		System.out.println("Enter string to concat");
		String st9=sc.nextLine();
		System.out.println("Concatenation: "+st3.concat(st9));
	}

}
