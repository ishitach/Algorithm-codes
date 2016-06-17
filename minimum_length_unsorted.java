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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		int a[]=new int[n];
		String[] str=br.readLine().split(", ");
		for(int i=0;i<n;i++) a[i]=Integer.parseInt(str[i]);
		sort(a);
		
		 //for(int i=0;i<n;i++){
		 //	 System.out.println(a[i]);
		 //}
}
	public static void sort(int[] a){
		int n=a.length; int i;
		for( i=0;i<n-1;i++)
		if(a[i]>a[i+1]) break;
		if(i==n-1) System.out.println("Array is sorted");
		int s=i;int e=n-1;
		int max=a[s]; int min=a[s];
		
		for(i=n-1;i>0;i--)
		if(a[i]<a[i-1]) break;
		e=i;
		
		for(i=s+1;i<=e;i++){
			if(max<a[i]) max=a[i];
			if(min>a[i]) min=a[i];
		}
		for( i=0;i<s;i++){
			if(a[i]>min) {s=i; break;}
		}
		for(i=n-1;i>=e+1;i--){
			if(a[i]<max){
				e=i; break;
			}
		}
		System.out.println(s+" "		+e);
	}
	
}
