package assignmentcredit;
import java.util.Scanner;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Creditcard implements Cloneable {
	static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
	String name;
	String cardnumnber;
	String date;
	public Creditcard(String name,String number,String date)
	{
	    this.name = name;
	    cardnumnber = number;
	    this.date = date;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static void main(String[] args)throws CloneNotSupportedException {
		Scanner sc =  new Scanner(System.in);
		print.println("Enter the Card details");
		print.println("Card Name :");
		String name = sc.nextLine();
		print.println("Card Number :");
		String number = sc.nextLine();
		print.println("Expiry date :");
		String date = sc.nextLine();
		Creditcard a = new Creditcard(name,number,date);
		print.println("Enter the Card details");
		print.println("Card Name :");
		String name1 = sc.nextLine();
		print.println("Card_Number :");
		String number1 = sc.nextLine();
		print.println("Expiry date :");
		String date1 = sc.nextLine();
		Creditcard b = new Creditcard(name1,number1,date1);
		
		if((a.cardnumnber).equals(b.cardnumnber))
		{
			print.println("The entered card number is same as original Card:");
		}
		else
		{
			print.println("The entered card number is different"); 
		}
		
		Creditcard c = (Creditcard)a.clone(); 
		print.println("Details of new cloned credit card:");
		print.println("Name :" + c.name );
		print.println("Credit Card Number :" + c.cardnumnber);
		print.println("Expiry Date :" + c.date);
	}
}
