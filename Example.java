package database;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, digit, temp, rem;
		double sum = 0;
	     Scanner in=new Scanner(System.in);
	     num1=in.nextInt();
	     digit=(int)Math.log10(num1)+1;//in.nextInt();
	     temp = num1;
	     while(temp != 0)
	     {
	         rem = temp%10;
	         sum = sum +( Math.pow(rem, digit));
	         temp = temp/10;
	     }
	 
	     if(sum == num1)
	     System.out.println(" is a Narcissistic Number\n"+num1);
	     else
	     System.out.println("is not a Narcissistic Number\n"+num1);

	}

}
