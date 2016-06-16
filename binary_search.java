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
		 int n =s.nextInt();
		 int a[]=new int[n];
		  for(int i=0;i<n;i++){
		  	a[i]=s.nextInt();
		  	//System.out.println(a[i]);
		  }
		  int k =s.nextInt();
//		  int z= binaryiter(a,0,n-1,k);
		  int z= binaryrec(a,0,n-1,k);
	System.out.println(z);
	}
	public static int binaryrec(int[] a,int left, int right, int key){
		
	if(right>=left){
		// int left =l;
		//  int right =r;
		  int mid=(left+right)/2;
		  if(a[mid]==key) //System.out.println(mid);
		  return mid;
		  if(a[mid]>key) return binaryrec(a,left,mid-1,key);
		   return binaryrec(a,mid+1,right,key);
		  
	}
	return -1;
	}
	
public static int binaryiter(int[] a, int l, int r, int key)	{
	while(r>=l){
		int mid=(l+r)/2;
		if(a[mid]==key) return mid;
		else if(a[mid]>key) r=mid-1;
		else l=mid+1;
	}
	return -1;
}
}
