package database;
import java.sql.*;
public class connect {
	static Connection con;
	static Statement stmt;
	private static connect instance = null;
	private connect()
	{
		
	}
	 public static connect getInstance()
	    {
	        if (instance == null)
	            instance = new connect();
	  
	        return instance;
	    }
	public static void getconnect()
	{
		try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","S.arun2002");
            System.out.println("Database get connected:");
            System.out.println("Inserting records into database!!");
            String sql="Insert into student values(8,'arun',8.5)";
            stmt=con.createStatement();
            stmt.executeUpdate(sql);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	}
	public static void closeconnection() throws SQLException
	{
		con.close();
		System.out.println("Database connection closed:");
	}
     public static void main(String[] args) throws SQLException
     {
    	 connect c = connect.getInstance();
    	 getconnect();
    	 closeconnection();
     }
}