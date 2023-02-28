public class newone {
	private static newone a=null;
	
	private newone()
	{
		System.out.println("gdggdg");
	}
  
	public static newone instance()
	{
		if(a == null)
		{
			a = new newone();
		}
		return a;
	}
	public static void main(String args[])
	{
		newone x = newone.instance();
		newone y = newone.instance();
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		
		
	}
}
