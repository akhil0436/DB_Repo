package DBTc.myneDBTc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Step1- Create connection
//Step2-create statements
//Step3-execute statements
//Step4-close connection

public class FirstDB_TC1 {

	public static void main(String[] args) throws SQLException {

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","root");
		
		
		Statement start=con.createStatement();
		
		
		String s="UPDATE ACTOR SET SALARY=67000 WHERE ACTOR_ID=1";
		start.execute(s);
		
		con.close();
		
		System.out.println("The program is exited");
		
	}

}
