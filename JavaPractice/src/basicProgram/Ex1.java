package basicProgram;

public class Ex1 {
	
	public static void M1() 
	{
		System.out.println("M1 executed");
	}
	
	public   void M2()
	{
		
		System.out.println("M2 Executed");
		
	}
public static void main(String args[] ) {

	Ex1.M1();
	System.out.println("Hello");
	
	Ex1 obj = new Ex1();
	obj.M2();
}
}
