package database;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int max;
	    Scanner in=new Scanner(System.in);
	    int b=in.nextInt();
	    int a[]=new int[b];
	    for(int i=0;i<b;i++){
	        a[i]=in.nextInt();
	    }
		for(int i=0;i<b;i++)
		{
		    for(int j=i+1;j<b;j++)
		   {
		    	if(a[i]>a[j]){
		        max=a[i];
		        a[i]=a[j];
		        a[j]=max;
		    	}
		    }
		}
		System.out.println(a[b-2]);
	}

}
