
public class overloadingmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=doubleNumber(4);
		System.out.println(doubleNumber(4));
		double numD;
		numD=doubleNumber(4.5);
		System.out.println(numD);
		numD=doubleNumber("one");
		System.out.println(numD);
		double numDE=doubleNumber(3,4);
		System.out.println(numDE);
		
	}
	public static double doubleNumber(double n)
	{
		double total=n*n;
		return total;
	}
	public static int doubleNumber(int n)
	{
		int total=n*n;
		return total;
	}
	public static double doubleNumber (double n, double m)
	{
		double total=(n+m)*(n+m);
		return total;
	}
	public static double doubleNumber(String n)
	{
		
		System.out.println("Can't calcuate a string");
		return 0;
	}
	

	
}
