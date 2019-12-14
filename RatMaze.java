class RatMaze{

	public static void main(String[] args){
		
		int arr[][] = { { 1, 0, 0, 0 }, 
                         { 1, 1, 0, 1 }, 
                         { 0, 1, 0, 0 }, 
                         { 1, 1, 1, 1 } }; 
		ratSolve(arr);
	}

	static boolean ratSolve(int[][] a){

		int[][] sol = new int[4][4];
		if(solRecur(a,0,0,sol) == false)
		{
			System.out.println("No solution");
			return false;
		}
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(sol[i][j]+ " ");	
			}
			 System.out.println();
		}
		return true;
				
	}

	static boolean isSafeZone(int[][] a, int x, int y){
	
		if((x <4 ) &&  (x >=0) && (y >=0) && (y<4) && a[x][y] ==1) {
			return true;
		}
		return false;
	}
	
	static boolean solRecur(int[][] a, int x, int y, int[][] sol){

		if(x ==3 && y ==3){
			sol[x][y] = 1;
			return true;
		}

		if(isSafeZone(a,x,y)){
			sol[x][y] = 1;
		

			if(solRecur(a, x+1,y, sol) || solRecur(a, x,y+1,sol)) return true;
		
			return false;
		}
		return false;
	}
}
