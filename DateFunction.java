package database1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFunction {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
		SimpleDateFormat d2=new SimpleDateFormat("dd-MM-yyyy");
		Calendar c1=Calendar.getInstance();
		System.out.println(d2.format(c1.getTime()));
		
	}

}			 
