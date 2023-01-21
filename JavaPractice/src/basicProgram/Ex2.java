
package basicProgram;

public class Ex2 {
	int a = 10;
    static int c= 12;
public void m1() {
	
	int b= 11;
	System.out.println("m1 executed");
	System.out.println(a);
	
}


public void m2() {
	
	System.out.println("m2 executed");
	System.out.println(c);
	System.out.println();

}

public static void main(String[] args) {
	Ex2 obj = new Ex2();

	obj.m1();
	obj.m2();
	
}
}
