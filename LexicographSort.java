package database;

import java.util.Arrays;
import java.util.Scanner;

public class LexicographSort {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
	    int n;
	    n=in.nextInt();
	    String a[]=new String[n];
	    for(int i=0;i<a.length;i++){
	        a[i]=in.next();
	    }
	    Arrays.sort(a);
	    for(int i=0;i<a.length;i++){
	    System.out.println(a[i]);
	    }
	}
}
