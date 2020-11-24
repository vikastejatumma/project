package java_programs;

public class Method {

	public static void main(String[] args) {
			
		int a = 34, b = 56, c = a+b;
		System.out.println("the sum of a and b is "+c);
		
		int x = methodA();
		System.out.println("the value returned method A is "+x);
	}
	
	 public static int methodA() {
		 System.out.println("inside method a");
		 methodB(9);
		 return 7;
		 
	 }
	
	 public static void methodB(int x) {
		 System.out.println("the value of x is"+x);
	 }
	 public static void methodC() {
		 System.out.println("inside method C");
	 }
}
