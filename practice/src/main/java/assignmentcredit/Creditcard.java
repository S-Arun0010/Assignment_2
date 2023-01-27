package assignmentcredit;
import java.util.Scanner;
import java.util.logging.Logger;
public class Creditcard implements Cloneable {
	String name;
	String cardnumnber;
	String date;
	public Creditcard(String n,String nu,String d)
	{
	    name = n;
	    cardnumnber = nu;
	    date = d;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String[] args)throws CloneNotSupportedException {
		Scanner sc =  new Scanner(System.in);
		Logger l= Logger.getLogger("com.api.jar");
		l.info("Enter the Card details");
		l.info("Card Name :");
		String name = sc.nextLine();
		l.info("Card Number :");
		String no = sc.nextLine();
		l.info("Expiry date :");
		String date = sc.nextLine();
		Creditcard c = new Creditcard(name,no,date);
		l.info("Enter the Card details");
		l.info("Card Name :");
		String na = sc.nextLine();
		l.info("Card_Number :");
		String nu = sc.nextLine();
		l.info("Expiry date :");
		String da = sc.nextLine();
		Creditcard d = new Creditcard(na,nu,da);
		if((c.cardnumnber).equals(d.cardnumnber))
		{
			l.info("The entered card number is same as original name");
		}
		else
		{
			l.info("The entered card number is different"); 
		}
		Creditcard b = (Creditcard)c.clone(); 
		Logger.log("Details of new credit card:");
		Logger.log("Name :" + b.name );
		Logger.log("Credit Card Number :" + b.cardnumnber);
		Logger.log("Expiry Date :" + b.date);
	}
}
