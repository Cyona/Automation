package seleniumMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatabaseTestingDemo {
	
	@Test
	public void databaseDemo() throws SQLException {
		//The getConnection() method of DriverManager class is used to establish connection with the database.

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		//The createStatement() method of Connection interface is used to create statement.
		//The object of statement is responsible to execute queries with the database.

		Statement stmt=con.createStatement(); 
		
		String s1="update student set sno=4 where sname='cyona'";
		stmt.executeUpdate(s1);
		String s2="delete from student where sno=4";
		stmt.executeUpdate(s2);
		String s3="insert into student values(101,'steve',100)";
		stmt.executeUpdate(s3);
		String s="select * from student";
		ResultSet rs=stmt.executeQuery(s);  //Result set is applicable for select to retrieve data or records of the table
		while(rs.next()) {
//			int sid=rs.getInt("sno");
//			String name=rs.getString("sname");
//			int smarks=rs.getInt("marks");
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		con.close();
		

	}

}


