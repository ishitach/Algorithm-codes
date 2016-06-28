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
		Scanner s=new Scanner(System.in);
		 int n =s.nextInt();
		 
		 for(int ui=0;ui<n;ui++){
		 	for(int j=0;j<=ui;j++){
		 		System.out.print(pascal(ui,j)+" ");
		 		
		 	}System.out.println();
		 			 }
		 			 
		 
	}
	
	public static int pascal(int i, int j){
		 			 	if(j==0) return 1;
		 			 	else if(j==i)  return 1;
		 			 	else return pascal(i-1,j-1)+pascal(i-1,j);
		 			 	
		 			 	
		 			 }
}
