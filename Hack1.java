package database1;

import java.util.Scanner;

public class Hack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a;
            int x=1;
            for(int j=0;j<n;j++){
              sum=sum+x*b;
              System.out.print(sum+" ");
              x=x*2;
            }
            System.out.println();
            sum=0;
            x=1;
        
        }
        in.close();
	}

}
