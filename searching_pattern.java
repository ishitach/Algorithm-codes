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
		String a="AABAACAADAABAAABAA";
   String pat= "AABA";
   for(int i=0;i<a.length()-pat.length();i++){
   	for(int j=0;j<pat.length();j++){
   		if(pat.charAt(j)!=a.charAt(i+j)) break;
   		
   		if(j==pat.length()-1) System.out.println("pat found at index no"+i);
   		
   	}
   	
   	
   }
   
	}
}
