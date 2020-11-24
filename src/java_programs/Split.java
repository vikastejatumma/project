package java_programs;

public class Split {

	public static void main(String[] args) {
		
		String t1 = "april 14th oneplus 8 pro launching and finally chandu purchased oneplus on april 20";
		String t2[] = t1.split("april 14th oneplus 8 pro launching and");
		
		System.out.println(t2[1]);
		System.out.println(t2[0]);
	}
}
