/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "abcxabcdabcdabcy";
        String pattern = "abcdabcy";
        boolean result = kmp(str.toCharArray(), pattern.toCharArray());
        System.out.print(result);
	}
	
	static boolean kmp(char[] str, char[] pattern){
		int[] a = patArray(pattern);
		int j =0, i=0;
		
		while(i<str.length && j<pattern.length){
			
			if(str[i] == pattern[j]){
				i+=1;
				j+=1;
			}
			else{
					if( j ==0 ){
					i++;
				}else{
					j = a[j-1];
				}
			}
			
		}
		if(j == pattern.length){
            return true;
        }
        return false;

	}
	
	static int[] patArray(char[] pattern){
		int[] a = new int[pattern.length];
		int j=0;
		for(int i = 1;i<pattern.length;){
			if(pattern[i] == pattern[j]){
				a[i] = j+1;
				i+=1;
				j+=1;
			}else{
				if( j ==0 ){
					i++;
				}else{
					j = a[j-1];
				}
			}
			// System.out.println(i+" "+j);
		}
		// for(int i=0;i<a.length;i++){
		// 	System.out.print(a[i]+" ");
		// }
		return a;
	}
}
