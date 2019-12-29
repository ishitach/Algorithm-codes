//to be checked not working

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int prime = 101;
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "abcxabcdabcdabcy";
        String pattern = "abcdabcy";
        int result = rkarp(str.toCharArray(), pattern.toCharArray());
        System.out.print(result);
	}
	
	static int rkarp(char[] str, char[] pattern){
	
		int x = str.length;
		int y = pattern.length;
		
		long strHash = newHash(str,y-1);
		long patternHash = newHash(pattern,y-1);
		
		for(int i=1;i<x-y;i++){
			if(strHash == patternHash && check(str, pattern, i-1,i+y-2,0,y-1)){
				
				return i-1;
			}else if(i < x-y){
				strHash = recalHash(str, i-1, i+y-1, patternHash, y);
			}
		}
		return -1;
	}
	
	static boolean check(char[] str, char[] pattern, int strS, int strE, int patS, int patE){
		if(patE-patS != strE-strS){
			return false;
		}
		while(strS<=strE && patS<=patE){
			if(str[strS]!=pattern[patS]){
				return false;
			}
			
			strS++;
			patS++;
		}
		return true;
		
	}
	
	static long recalHash(char[] str, int oldIndex, int newIndex ,long patternHash, int len){
	
		long val = patternHash - str[oldIndex];
		val = (int)val/prime;
		val = val + (int)(str[newIndex]*Math.pow(prime,len-1));
		return val;
	}
	
	static long newHash(char[] pattern, int last){
		long hash = 0;
		for(int i=0;i<=last;i++){
			hash += pattern[i]*Math.pow(prime,i);	
		}
		return hash;
	}
}
