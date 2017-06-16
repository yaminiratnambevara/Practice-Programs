package database;

import java.util.Scanner;

public class Maxint {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
	    int temp=a,max = 0;
	    while(a!=0){
	        temp=a%10;
	        if(max<temp){
	            max=temp;
	        }
	        a=a/10;
	    }
	    System.out.println(max);
	}
}
