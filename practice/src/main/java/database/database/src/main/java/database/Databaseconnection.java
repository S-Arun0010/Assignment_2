package database;
import java.sql.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Databaseconnection {
	
	static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
	static Connection con;
	static Statement state;
	
	public static void getconnect() throws ClassNotFoundException, SQLException
	{
		
		String password = "S.arun2002";

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root",password);
		print.println("Database get connected:");
	}
	public static void closeconnection() throws SQLException
	{   
		con.close();
		print.println("Database get closed:");
	}
	public static void main(String[] args) 
	{   try
	{
		Singleton c = Singleton.getInstance();
		Databaseconnection data = new Databaseconnection();
		data.getconnect();
		state = con.createStatement();
		String sql="insert into student values(7,'arun',8.5)";
		state.executeUpdate(sql);
		sql = "Delete from student where id=7;";
		state.executeUpdate(sql);		
		data.closeconnection();
	}
	catch(SQLException e)
	{
		print.println(e);
	}
	catch(ClassNotFoundException e)
	{
		print.println(e);
	}
	}

}
