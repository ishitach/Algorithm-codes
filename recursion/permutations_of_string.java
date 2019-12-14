/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "ABC";
		permute(str, "");
	}
	
	static void permute(String str, String temp){
		
		if(str.length() ==0){
			System.out.println(temp);
			return;
		}
		
		for(int i=0;i<str.length();i++){
			char x = str.charAt(i);
			permute((str.substring(0,i) + str.substring(i+1)), x + temp);
		}
		
		return;
	}
}
