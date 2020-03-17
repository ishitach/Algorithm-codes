class Solution{

	public static void main(String[] args){

		int[] w = new int[]{1,3,4,5};
		int[] val = new int[]{1,4,5,7};
		int total = 7;
		System.out.println(knapsack(w,val, total,4));
}
	
	private static int knapsack(int[] w,int[] val,int total, int i){
		if(total ==0 || i==0){
      return 0;
    }

    if(w[i-1]>total){
      return knapsack(w,val, total,i-1);
    }
    else{
      return Math.max(val[i-1]+knapsack(w,val, total-w[i-1],i-1)  ,knapsack(w,val, total,i-1));
    }
   }
}
