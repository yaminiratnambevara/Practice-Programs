package database;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int e = 0,o = 0;
	    int arr[]=new int[a];
	    for(int i=0;i<a;i++){
	    	arr[i]=in.nextInt();
	    }
	    for(int i=0;i<a;i++){
	        if(arr[i]%2==0){
	            e=e+arr[i];
	        }
	        else{
	            o=o+arr[i];
	        }
	    }
	    int res=e*o;
	    System.out.println(res);
	}

}
