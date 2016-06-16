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
		String[] str=br.readLine().split(" ");
		for(int i=0;i<n;i++) a[i]=Integer.parseInt(str[i]);
		
	insertion(a);
		 for(int i=0;i<n;i++){
		 	 System.out.println(a[i]);
		 }
	}
	public static void insertion(int[] a){
		int n=a.length;
		for(int i=1;i<n;i++){
			int key=a[i];
			int j=i-1;
			while(j>=0  && a[j]>key){
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
	}
	
	
}
