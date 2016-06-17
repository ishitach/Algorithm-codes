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

	String a=br.readLine();
	String b=br.readLine();

		int p=ed(a,b,a.length(),b.length());
//System.out.println(b.length());

		System.out.println(p);
	
	}
	
public static int ed(String a,String b,int x,int y){
	int[][] mat=new int[x+1][y+1];
	for(int i=0;i<x+1;i++){
		for(int j=0;j<y+1;j++){
			if(i==0) mat[i][j] =j;
			else if(j==0) mat[i][j]=i;
			else if(a.charAt(i-1)==b.charAt(j-1)) mat[i][j]=mat[i-1][j-1];
			else{
				mat[i][j]=1+Math.min(mat[i-1][j-1],Math.min(mat[i-1][j],mat[i][j-1]));
			}
			
		}
	}
	return mat[x][y];
	
}
}
