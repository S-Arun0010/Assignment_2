package assignmentclone;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Clone implements Cloneable {
	
	static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
	private int x;
	private int y;
    public Clone(int x1,int y1)
    {
    	x=x1;
    	y=y1;
    }
    
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		return (this.x == ((Clone) obj). x) && (this.y == ((Clone) obj). y); 
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
public static void main(String[] args)throws CloneNotSupportedException 
 {   
	
	 Scanner sc = new Scanner(System.in);
	print.println("Enter the values of point :");
	 int x=sc.nextInt();
	 int y= sc.nextInt();
	 Clone p = new Clone(x,y);
	 print.println("Enter the values of point :");
	 int a=sc.nextInt();
	 int b= sc.nextInt();
	 Clone q = new Clone(a,b);
	 if(p.equals(q))
		 {
		 print.println("Both points are equal");
		 }
	 else
	 {
		 print.println("Both points are not equal");
	 }
	 Clone r = (Clone)p.clone();
	 print.println("Values of Cloned Objects: " + (r.x) +" " + (r.y));
 }
}
