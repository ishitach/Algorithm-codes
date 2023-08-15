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
		
		int n = 3;
		toh(n,11,12,13);
		
	}
	
	public static void toh(int n, int a, int b, int c){
		if(n ==0){
			return;
		}
		
		toh(n-1,a,c,b);
		System.out.println(n+" "+ a+" "+b);
		
		toh(n-1,c,b,a);
		
	}
}
