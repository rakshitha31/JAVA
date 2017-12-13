package recur;
import java.util.*;
public class Matrix {
	public static void main(String[] args) {
        int sum1=0,sum2=0,d=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = in.nextInt();
        
        int a[][] = new int[n][n];
        System.out.println("Enter matrix");
           for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();             
            }
        }
         for(int m=0; m < n; m++){
            for(int p=0; p < n; p++){
                if(m==n){
                   sum1+=(a[m][n]);}
         }
         }
        
           for(int g=0; g < n; g++){
            for(int r=0; r < n; r++){
            }
				sum2+=(a[g][n-g]);
             }
        
         d=Math.abs(sum1-sum2);
        System.out.println(d);
  }

	}
             

