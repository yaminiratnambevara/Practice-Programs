package database;

import java.util.Scanner;

public class SumInt {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
	    int temp1=a, sum1=0,temp2 = b,sum2=0;
	    int x=a,y=b;
	    while(a!=0){
	        temp1=a%10;
	        sum1=sum1+temp1;
	        a=a/10;
	    }
	    while(b!=0){
	        temp2=b%10;
	        sum2=sum2+temp2;
	        b=b/10;
	    }
	    System.out.println(sum1+" "+sum2);
	    if(sum1>sum2){
	        System.out.println(x);
	    }
	    else if(sum1<sum2)
	    System.out.println(y);
	    else
	    System.out.println("Equal");
	}

}
