/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{static int dem[]={1, 2, 5, 10, 20, 50, 100, 500, 1000};
	static	int n =dem.length;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		findmin(121);
			}
			public static void findmin(int m){
				ArrayList<Integer> a=new ArrayList<Integer>();
								int min=0;
				for(int i=n-1;i>=0;i--){
					while(m>=dem[i]){
						m-=dem[i];
						a.add(dem[i]);
					}
				}System.out.print("Required denomination is ");
				for(int i=0;i<a.size();i++){
					System.out.print(a.get(i)+" ");
				}
			}
			
}
