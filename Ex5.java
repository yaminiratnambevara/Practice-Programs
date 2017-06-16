package database;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int x=0;
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
		    arr[i]=in.nextInt();
		}
		int b=in.nextInt();
		for(int i=0;i<a;i++){
		    for(int j=i+1;j<a;j++){
		         x=arr[i]+arr[j];
		         if(x==b){
			            break;
			        }
			        else
			        continue;
		        }
		    if(x==b){
		        break;
		    }
		    else
		    {
		    	continue;
		    }
		    
		    }
		if(x==b){
			System.out.println("True");
		}
		else
			System.out.println("false");
		   
	}

}
