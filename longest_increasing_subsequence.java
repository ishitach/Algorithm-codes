/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{static int max;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		int a[]=new int[n];
		String[] s=br.readLine().split(" ");
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(s[i]);
		}
		
		// for(int i=0;i<n;i++){
		// 	System.out.println(a[i]);
		// }
		lis(a,n);
	}
	
	public static void lis(int[] a,int n){
		
		max=1;
		res(a,n);
		//return max;
		System.out.println(max);
	}
	public static int res(int[] a,int n){
		if(n==1) return 1; //base case
		
		int resl, max_end=1;
		
		for(int i=1;i<n;i++){
			resl=res(a,i);
			if(a[i-1]<a[n-1] && resl+1>max_end) max_end=resl+1;
			
		}
		if(max<max_end) max=max_end;
		return max_end;
		
	}
}
