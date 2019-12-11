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
		int start[]  =  {10, 12, 20};
    	int finish[] =  {20, 25, 30};
    	int lat =-1;
    	for(int i=0;i<finish.length;i++){
    		if(i ==0 ){
    			System.out.println(i);
    			lat = i;
    		}
    		else if(finish[lat]<=start[i]){
    				System.out.println(i);
    			lat = i;
    		}
    	}
	}
}
