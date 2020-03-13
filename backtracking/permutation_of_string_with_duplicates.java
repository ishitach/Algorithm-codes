import java.util.*;
import java.io.*;

class Permutation{

	public static void main(String[] args){

		String str = “AABC”;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			if(!map.containsKey(str.charAt(i))){
				map.put(str.charAt(i),1);
}	
else{
	map.put(str.charAt(i),map.get(str.charAt(i))+1);
}
}
int size = map.size();
int[] count=new int[size];
char[] string=new char[size];
char[] resp = new char[str.length()];
//String resp= “”;
int j=0;
for(Map.Entry<Character, Integer> i: map.entrySet()){
	string[j]=i.getKey();
	count[j]=i.getValue();
	j++;
}

		permute(string,count,0, resp);
}

	private static void permute(char[] str, int[] count, int length, char[] resp){

		//System.out.println(resp.length +” “+new String(resp)+” “+length);
		if(resp.length== length){
			System.out.println(new String(resp));
			return;
}
	
		for(int i=0;i<str.length;i++){
			if(count[i]!=0){
resp[length]=str[i];
count[i]--;
permute(str,count,length+1, resp);
count[i]++;
}
		}
		
}
}
