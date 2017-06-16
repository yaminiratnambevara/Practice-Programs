package database;
public class CandicateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
	  /* Scanner in=new Scanner(System.in);
	    double principal;
	    int interest, year;
	    double simpleInterest;
	    principal=in.nextDouble();
	    interest=in.nextInt();
	    year=in.nextInt();
	    simpleInterest=(principal*interest*year)/100;
	    long si=Math.round(simpleInterest);
	    System.out.println(si);*/
	   int i,fact=1;  
	   int number=6;//It is the number to calculate factorial    
	   for(i=1;i<=number;i++){    
	       fact=fact*i;    
	   }    
	   System.out.println("Factorial of "+number+" is: "+fact);    
   }
}