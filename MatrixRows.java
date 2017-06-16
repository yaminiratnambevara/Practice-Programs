package database;

import java.util.Scanner;

public class MatrixRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a1,b1;
	    a1=in.nextInt();
	    b1=in.nextInt();
		int m1[][]=new int[a1][b1];
		for(int i=0;i<a1;i++){
		    for(int j=0;j<b1;j++){
		        m1[i][j]=in.nextInt();
		    }
		}
		int a[]=new int[a1];
		for(int i=0;i<a1;i++){
			int sum=0;
			for(int j=0;j<b1;j++){
				sum=sum+m1[i][j];
			}
			a[i]=sum;
		}
		for(int i=0;i<a1;i++){
			System.out.println(a[i]);
		}
		//int max=a[1];
		int x=0;
		for(int i=0;i<a1;i++){
			int max=a[i];
			if(max>a[x]){
				x=i;
			}
		}
		System.out.println("Row "+(x+1));
	}

}
