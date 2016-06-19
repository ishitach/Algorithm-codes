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
		int p=add(50,3);
		System.out.println(p);
	}
	public static int add(int a,int b){
		if(b==0) return a;
		else return add(a^b,(a&b)<<1);
	}
}
