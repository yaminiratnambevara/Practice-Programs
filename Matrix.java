package database;

import java.util.Scanner;

public class Matrix {
	/* Read input from STDIN. Print your output to STDOUT*/

	   public static void main(String args[] ) throws Exception {

		//Write code here
		Scanner in=new Scanner(System.in);
		int a1,b1,a2,b2;
	    a1=in.nextInt();
	    b1=in.nextInt();
		int m1[][]=new int[a1][b1];
		for(int i=0;i<a1;i++){
		    for(int j=0;j<b1;j++){
		        m1[i][j]=in.nextInt();
		    }
		}
	    a2=in.nextInt();
	    b2=in.nextInt();
		int m2[][]=new int[a2][b2];
		for(int i=0;i<a2;i++){
		    for(int j=0;j<b2;j++){
		        m2[i][j]=in.nextInt();
		    }
		}
		  int m3[][]=new int[a1][b1];
		if(a1==a2&&b1==b2){
		  
		    for(int i=0;i<a1;i++){
		        for(int j=0;j<b1;j++){
		            m3[i][j]=m1[i][j]+m2[i][j];
		        }
		    }
		}
		for(int i=0;i<a1;i++){
		    for(int j=0;j<b1;j++){
		        System.out.print(m3[i][j]+" ");
		    }
		    System.out.println("");
		}
	   }
	}


