/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Heapsort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s =new Scanner(System.in);
		 int n =s.nextInt();int[] a=new int[n];
		 for(int i=0;i<n;i++) a[i]=s.nextInt();
		 Heapsort hp=new Heapsort();
		 
		 hp.sort(a);
		  for(int i=0;i<n;i++) System.out.println(a[i]);
		 
	}
	public static void sort(int[] arr){
		int n =arr.length;
		for(int i=n/2-1;i>=0;i--){
			heapify(arr,n,i);
		}
		for(int i=n-1;i>=0;i--){
			// arr[i]=arr[i]^arr[0];
			// arr[0]=arr[0]^arr[i];
			// arr[i]=arr[i]^arr[0];
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
			}
	
	public static void heapify(int[] arr, int n,int i){
		int larg=i;
		int l=2*i;
		int r=2*i+1;
		
		if(l<n && arr[l]>arr[larg]) larg=l;
		if(r<n && arr[r]>arr[larg]) larg=r;
		
		if(larg!=i){
			// arr[i]=arr[i]^arr[larg];
			// arr[larg]=arr[larg]^arr[i];
			// arr[i]=arr[i]^arr[larg];
			int temp=arr[i];
			arr[i]=arr[larg];
			arr[larg]=temp;
		heapify(arr,n,larg);
		}
		
	}
	
}
