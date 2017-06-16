package database;

import java.util.Scanner;

public class Sub1 {
	/* Read input from STDIN. Print your output to STDOUT*/

	   public static void main(String args[] ) throws Exception {

		//Write code here
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int x = 0,y=0;
		int arr[]=new int[a];
	    for(int i=0;i<a;i++){
	        arr[i]=in.nextInt();
	    }
	    for(int i=0;i<a;i++){
	        if(arr[i]<arr[i+1]){
	            x=arr[i+1];
	        }
	    }
	    for(int i=0;i<a;i++){
	        int max=0;
	        if(max<arr[i]){
	            max=arr[i];
	        }
	        if(max==arr[a]){
	            y=max;
	        }
	        else{
	            for(int j=a;j>=0;j--){
	                if(arr[j]<arr[j-1]){
	                    y=arr[j-1];
	                }
	            }
	        }
	    }
	    for(int i=x;i<=y;i++){
	        System.out.println(arr[i]);
	    }
	   }
	}


