package database1;

import java.io.IOException;
import java.util.Scanner;

public class CodeGladiators {
	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int output = 0;
	        System.out.println("enter x");
	        int ip1 = Integer.parseInt(in.nextLine().trim());
	        System.out.println("enter y");
	        int ip2 = Integer.parseInt(in.nextLine().trim());
	        int ip3_size = 0;
	        System.out.println("enter n");
	        ip3_size = Integer.parseInt(in.nextLine().trim());
	        int[] ip3 = new int[ip3_size];
	        int ip3_item;
	        for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
	            ip3_item = Integer.parseInt(in.nextLine().trim());
	            ip3[ip3_i] = ip3_item;
	        }
	        output = GetJumpCount(ip1,ip2,ip3);
	        System.out.println(String.valueOf(output));
	    }
		 //h1 = 9 % (5-1) * 2 =  round(9%4) = 1 * 2 = 2
	private static int GetJumpCount(int ip1, int ip2, int[] ip3) {
		// TODO Auto-generated method stub
		int n=ip3.length;
		int sum=0;
		int temp[]=new int[n];
		int x=ip1-ip2;
		for(int i=0;i<n;i++){
			temp[i]=(ip3[i]%x)*n;
			System.out.println(temp[i]);
		}
		for(int i=0;i<n;i++){
			
		}
	//	output1=jumpAmount(ip1,ip3[--n],(ip1-ip2));
		return sum;
	}
}
