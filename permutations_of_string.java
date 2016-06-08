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
		Scanner s =new Scanner(System.in);
		String str=s.next();
		permute(str.toCharArray(),0,str.length());
		
	}
	public static void swap(char[] s, int l, int r){
		
		char temp=s[l];
		s[l]=s[r];
		s[r]=temp;
		
	}
	public static void permute(char[] s,int l,int r){
		if(l==r) 
		System.out.println(new String(s));
		
		for(int i=l;i<r;i++){
			swap(s,l,i);
			
		permute(s,l+1,r);
		swap(s,l,i);
		}
	}
	
}
