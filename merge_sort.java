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
		
	//insertion(a);
	merges(a,0,n-1);
		 for(int i=0;i<n;i++){
		 	 System.out.println(a[i]);
		 }
	}
	
	public static void merges(int a[], int left, int right){
		if(left<right){
			int mid=(left+right)/2;
			merges(a,left,mid);
			merges(a,mid+1,right);
			
			tomerge(a,left,mid,right);
		}
	}
	
	public static void tomerge(int[] a,int left, int mid, int right){
		int a1=mid+1-left;
		int a2=right-mid;
		int l[]=new int[a1];
		int r[]=new int[a2];
		for(int i=0;i<a1;i++) l[i]=a[left+i];
		for(int i=0;i<a2;i++) r[i]=a[mid+i+1];
		
		//Merging of indexes 
		
		int i=0;int j=0;
		int k=left;
		
		while(i<a1 && j<a2){
			
			if(l[i]<=r[j]) {
				a[k]=l[i];
				i++;
			}
			else{
				a[k]=r[j];  j++;
			}
		k++;	
		}
		while(i<a1) {
			a[k]=l[i];
			i++;k++;
		}
		while(j<a2){
			a[k]=r[j];
			j++;
			k++;
		}
		
		
	}
	
	
}
