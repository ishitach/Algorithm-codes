//Longest common subsequence  

import java.util.*;
class lis{

public static void main(String[] args){

                String one = "abcdaf";
                String two = "acbcf";
                System.out.println(lis(one,two));
      }

        private static int lis(String one, String two){

                int[][] temp = new int[one.length()+1][two.length()+1];
                int resp =0;
                for(int i=1;i<=one.length();i++){
                        for(int j=1;j<=two.length();j++){
                                if(one.charAt(i-1) == two.charAt(j-1)){
                                        temp[i][j] = temp[i-1][j-1]+1;
                                }
                                  else{
                                          temp[i][j] = Math.max(temp[i-1][j],temp[i][j-1]);
                                }
                         }
                 }
                 return temp[one.length()][two.length()];
      }

}
