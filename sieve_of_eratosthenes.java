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
		int n =s.nextInt();
		sieve(n);
		
	}
	public static void sieve(int n){
		//int isprime[]=new int[n];
		boolean isprime[]=new boolean[n+1];
		
		for(int i=2;i<=n;i++){
			//System.out.println(isprime[i]);
			isprime[i]=true;
		}
		for(int i=2;i*i<=n;i++){
			for(int j=i;j*i<=n;j++){
				
				isprime[i*j]=false;
			}
		}int c=0;
		for(int i=0;i<=n;i++){
			if(isprime[i]==true) c++;
			
		}
		System.out.println(c);
		
	}
}
