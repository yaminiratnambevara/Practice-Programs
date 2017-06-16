package database;

import java.util.Scanner;

public class MatrixDiagnal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a1,b1,md1 = 0,md2 = 0;
	    a1=in.nextInt();
	    b1=in.nextInt();
		int m1[][]=new int[a1][b1];
		for(int i=0;i<a1;i++){
		    for(int j=0;j<b1;j++){
		        m1[i][j]=in.nextInt();
		    }
		}
		for(int i=0;i<a1;i++){
				md1=md1+m1[i][i];
		}
		int k=a1-1;
		for(int i=0;i<a1;i++){
			if(k>=0){
				md2=md2+m1[i][k];
				k--;
			}
		}
		System.out.println(md1+" "+md2);
		if(md1>md2){
			System.out.println("Diagonal 1");
		}
		else if(md1<md2){
			System.out.println("Diagonal 2");
		}
		else
			System.out.println("Equal");
	}

}
