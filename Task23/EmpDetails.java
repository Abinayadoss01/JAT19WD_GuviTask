package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDetails {

	public static void main(String[] args) {
		// Intializing the url,username and password
		String URL = "jdbc:mysql://localhost:3306";
		String Username="root";
		String Password="root";
		
		try {
			Connection connection = DriverManager.getConnection(URL, Username, Password);
			
			if(connection!=null) {
				System.out.println("JDBC Connection is done successfully");
			}
			else {
				System.out.println("JDBC Connection is not done due to some issue");
			}
			
			Statement stmt = connection.createStatement();
			String createDB = "create database EmployeeDetails";
			String useDB = "use EmployeeDetails";
			String createTable = "create table EmpdetailsTable (empcode int not null,empname varchar(15),empage int not null,empsalary int not null)";
			String insertTable = "insert into EmpdetailsTable (empcode ,empname ,empage ,empsalary) values(102,'Jacky',30,20000),(103,'Joe',20,40000),"
					+ "(104,'John',40,80000),(102,'Shameer',25,90000)";
			//stmt.execute(createDB);
			stmt.execute(useDB);
			//stmt.execute(createTable);
			stmt.execute(insertTable);
			}
		catch(SQLException se){
			se.printStackTrace();
			}
}
}