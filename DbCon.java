package database;

import java.sql.*;

public class DbCon {
	public static void main(String args[]){	
		Connection con;
		Statement stmt;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to database");
			con=DriverManager.getConnection("jdbc:mysql//localhost:3306/mysql", "root", "1258");
			stmt=con.createStatement();
			ResultSet res=stmt.executeQuery("select * from student");
			while(res.next()){
				System.out.println(res.getInt(1)+""+res.getString(2)+""+res.getString(3));
			}
			con.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
