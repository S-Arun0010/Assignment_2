package database;
import java.sql.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Databaseconnection {
	
	static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
	static Connection con;
	static Statement state;
	
	public void getconnect() throws ClassNotFoundException, SQLException
	{

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","S.arun2002");
		print.println("Database get connected:");
	}
	public void closeconnection() throws SQLException
	{   
		con.close();
		print.println("Database get closed:");
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException
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

}
