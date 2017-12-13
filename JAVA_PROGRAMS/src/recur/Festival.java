//Cmmand line arguments

package recur;
import java.util.*;
public class Festival {

		final int days=9;
		String sweet[]=new String[days];
		Festival(String s0,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8) {
			sweet[0]=s0;sweet[1]=s1;sweet[2]=s2;sweet[3]=s3;sweet[4]=s4;sweet[5]=s5;
			sweet[6]=s6;sweet[7]=s7;sweet[8]=s8;
			for(int i=1;i<=sweet.length;i++) {
			System.out.println("day "+i+"sweet is "+sweet[i-1]);
			}
		}
		public static void main(String[] args){
			Festival obj=new Festival(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8]);
//Run Configurations and give input there
		}
	}
