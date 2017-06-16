package database;

import java.util.Scanner;

public class BtoD {
	public static void main(String args[] ) throws Exception {

		//Write code here
		Scanner in= new Scanner(System.in);
		System.out.println("enter binary number");
		int binary=in.nextInt();
		int decimal = 0;
	        int power = 0;
	        while(isBinary(binary)){
	            if(binary == 0){
	                break;
	            } else {
	                int tmp = binary%10;
	                decimal += tmp*Math.pow(2, power);
	                binary = binary/10;
	                power++;
	            }
	        }
	        if(decimal!=0)
	        System.out.println(decimal);
	        else
	        	System.out.println("enter number is not a decimal number");
	   }
	static boolean isBinary(int num){
		
		int num1=num;
		boolean res=true;
		if(num1!=0){
			int temp=num1%10;
			if(temp>1){
				res=false;
			}
			else{
				temp=num/10;
			}
		}
		return res;
		
	}
}
 