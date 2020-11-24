package over_ridding;

public class Demo {
 
/* When a method in the child class (i.e. sub-class)is duplicate of a method in parent class (i.e.Super-class)
 then the method in the sub-class is said to override the method in super class*/
	
	public static void main(String[] args) {
		
		
		Car v = new Car();
		
		v.startCar();
		
		
		Benz b = new Benz();
		
		b.startCar();
	}

}
