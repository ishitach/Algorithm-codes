/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{static int h=4;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int a[][]={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
		maze(a);
		
	}
	
	public static boolean
	maze(int[][] a){
		int b[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		if(solve(a,0,0,b)==false) {System.out.println("No path ");return false;}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++) System.out.print(b[i][j]);
			System.out.println();
		}
		return true;
	}
	public static boolean solve(int [][]a,int m,int n, int [][]b){
		if(m==h-1&& n==h-1){ b[m][n]=1; return true;}
		if(safe(a,m,n)==true){
			b[m][n]=1;
			if(solve(a,m+1,n,b)) return true;
			if(solve(a,m,n+1,b)) return true;
			b[m][n]=0;
			return false;
		}
		return false;
	}
	public static boolean safe(int[][] a,int x,int y){
		return (x>=0 &&y>=0 &&x<h &&y<h && a[x][y]==1);
	}
	
	
	
}
