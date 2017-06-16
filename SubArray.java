package database;

import java.util.Scanner;

public class SubArray {
	public static void main(String args[]){
		 
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int s = 0, e = n-1, i, max, min;
		int arr[]=new int[n];
		for(int j=0;j<n;j++){
			arr[j]=in.nextInt();
		}
		for ( s = 0; s < n-1; s++)
		  {
		    if (arr[s] > arr[s+1])
		      break;
		  }
		  if (s == n-1)
		  {
		    System.out.println("The complete array is sorted");
		  }
		  for(e = n - 1; e > 0; e--)
		  {
		    if(arr[e] < arr[e-1])
		      break;
		  }
		  max = arr[s]; min = arr[s];
		  for(i = s + 1; i <= e; i++)
		  {
		    if(arr[i] > max)
		      max = arr[i];
		    if(arr[i] < min)
		      min = arr[i];
		  }
		  for( i = 0; i < s; i++)
		  {
		    if(arr[i] > min)
		    {  
		      s = i;
		      break;
		    }      
		  } 
		  
		  for( i = n -1; i >= e+1; i--)
		  {
		    if(arr[i] < max)
		    {
		      e = i;
		      break;
		    } 
		  }  
		  for(int k=s;k<=e;k++){
		      System.out.print(arr[k]+" ");
		  }
		  System.out.println(s+""+e);
	}
}
