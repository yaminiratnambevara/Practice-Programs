package database;

import java.util.Scanner;

public class ArrAvg {
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.println("enter array length");
	int a=in.nextInt();
    int arr[]=new int[a];
    System.out.println("enter array values");
    for(int i=0;i<a;i++){
    	arr[i]=in.nextInt();
    }
    int e=0,o=0,ce=0,co=0;
    for(int i=0;i<a;i++){
        if(arr[i]%2==0){
            e=e+arr[i];
            ce++;
        }
        else{
            o=o+arr[i];
            co++;
        }
    }
    int avgE,avgO,res;
    avgE=Math.round(e/ce);
    avgO=Math.round(o/co);
    res=avgE+avgO;
    System.out.println(res);
	}
}
