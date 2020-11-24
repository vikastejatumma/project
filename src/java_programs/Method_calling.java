package java_programs;

public class Method_calling {

	public static void main(String[] args) {
      
		Method_calling.m1();
		vicky v = new vicky();// for non-static methods we have to create objects
		v.name = "vikas";
		v.height = 5.9;
		v.colour = "white";
		v.m2();
		
	}

	
	public static void m1() { //static methods
		
		int a=3,b=5,c=a*b;
		System.out.println("the multiplication of and a and b is "+c);
	}
}
 class vicky{
	 String name;
		double height;
		String colour;
	
	public void m2() { // non-static methods
		int i=9,j=8,k=i-j;
		
		System.out.println("the substraction of i and j is "+k);
		System.out.println("the name is "+name);
		System.out.println("the height is "+height);
		System.out.println("the colour is "+colour);
	}
}
