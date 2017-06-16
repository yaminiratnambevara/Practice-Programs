package database;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter string");
		    String y=in.nextLine();
		    int u=0,l=0;
		    int len=y.length();
		    for(int i=0;i<len;i++){
		        if(Character.isUpperCase(y.charAt(i))){
		            u++;
		        }
		        else if(Character.isLowerCase(y.charAt(i))){
		            l++;
		        }
		    }
		    System.out.println(u+"\n"+l);
	}

}
