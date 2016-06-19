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
		int[] a={3,3,2,2,6,2,3}; int n =a.length;
		int one=0; int two=0;
		int mask=0;
		for(int i=0;i<n;i++){
			two=two | (one&a[i]);
			one=one^a[i];
			mask=~(one & two);
			one=one&mask;
			two=two&mask;
		}
		System.out.println(one);
	}
}
