/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n = 10;
		int[] nos = new int[150];
		nos[0]=1;
		int no_2 = 2;
		int no_3 = 3;
		int no_5 = 5;
		int temp = 1;
		int count2=0;
		int count3=0;
		int count5=0;
		
		for(int i=1;i<n;i++){
			
			temp = Math.min(Math.min(no_2,no_3),no_5);
			nos[i]=temp;
			
			if(temp == no_2){
				count2++;
				no_2 = nos[count2]*2;
			}
						
			if(temp == no_3){
				count3++;
				no_3= nos[count3]*3;
			}
						
			if(temp == no_5){
				count5++;
				no_5 = nos[count5]*5;
			}
			
		}
				System.out.println(temp);

	}
}
