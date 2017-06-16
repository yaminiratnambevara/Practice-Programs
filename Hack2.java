package database1;

import java.util.Scanner;

public class Hack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		for (int i=0;i<3;i++){
            String string = in.next();
              int num = in.nextInt();


            System.out.printf("%-14s %03d %n", string, num);
            }
	}

}
