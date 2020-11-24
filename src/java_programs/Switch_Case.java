package java_programs;

public class Switch_Case {
/*It is alternative to if condition the given data with different cases.To
which cases data matches that particular case will execute.
*Every case should end with colon
*Every case will have break statement to come out of statement
*Default always execute the above cases are not matching*/

	public static void main(String[] args) {
       String course = "selenium";
       switch(course.toUpperCase())
       {
    	   case "manual":
    	   System.out.println("course is available::"+course);
    	   		break;
    	   case "automation":
        	   System.out.println("course is available::"+course);
        	   		break;
    	   case "qtp":
        	   System.out.println("course is available::"+course);
        	   		break;
    	   case "java":
        	   System.out.println("course is available::"+course);
        	   		break;
    	   case "SELENIUM":
        	   System.out.println("course is available::"+course);
        	   		break;
        	   		default:
        	   			System.out.println("we are sorry::"+course);
       }
	}

}
