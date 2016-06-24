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
		String str=s.next();
		System.out.println(mininsert(str,0,str.length()-1));
		
	}
	public static int mininsert(String str, int s,int e){
		if(s==e) return 0;
		if(s==e-1) return (str.charAt(s)==str.charAt(e))?0:1;
		
		if(str.charAt(s)==str.charAt(e))	 return mininsert(str,s+1,e-1);
		else return Math.min(mininsert(str,s,e-1),mininsert(str,s+1,e))+1;
	}
	
}
