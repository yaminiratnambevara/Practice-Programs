package database;

import java.util.Scanner;

public class EvenOddInt {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
	    int temp=a,e = 0,o=0;
	    while(a!=0){
	        temp=a%10;
	        if(temp%2==0){
	            e=e+temp;
	        }
	        else{
	            o=o+temp;
	        }
	        a=a/10;
	    }
	    if(e>o){
	        System.out.println(e-o);
	    }
	    else
	    System.out.println(o-e);

	}
}
