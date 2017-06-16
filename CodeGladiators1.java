package database1;

import java.util.Scanner;

public class CodeGladiators1 {
	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
	    int y=in.nextInt();
		n=in.nextInt();
	    int a[] = new int[n];
	    for(int i=0;i<n;i++){
	    	a[i]=in.nextInt();
	    }
	    GetJumpCount(x,y,n,a);

	    System.out.println(output1);
	}
	static int output1;
	public static void GetJumpCount(int climbUp,int climbDown,  int noOfWalls, int[] wallHeights)
	{
	        while(noOfWalls>0)
	            output1 = jumpAmount(climbUp, wallHeights[--noOfWalls], (climbUp - climbDown));
	}  

	private static int jumpAmount(int climbUp, int hight, int oneJump){
	    if( hight <= climbUp)
	        return ++output1;
	    else{
	        ++output1;
	        return jumpAmount(climbUp, (hight-oneJump), oneJump);
	    }
	}

}
