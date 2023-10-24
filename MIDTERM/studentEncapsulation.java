import java.util.Scanner;

public class studentEncapsulation {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Student student = new Student();
	    
		System.out.println("What is your name? ");
		System.out.print("First name: ");
		student.firstName(scanner.nextLine());
		System.out.print("Middle Name: ");
		student.middleName(scanner.nextLine());
		System.out.print("Last Name: ");
		student.lastName(scanner.nextLine());
		System.out.print("Suffix: ");
		student.suffix(scanner.nextLine());
		
		System.out.println("Full Name: "+student.fullName());
		
		scanner.close();
	}
	
	    private static class Student {
	        private String first_name;
	        private String middle_name;
	        private String last_name;
	        private String suffix;
	   
	      public void firstName(String first_name) {
	          this.first_name = first_name;
	      }
	      public void middleName(String middle_name) {
	          this.middle_name = middle_name;
	      }
	      public void lastName(String last_name) {
	          this.last_name = last_name;
	      }
	      public void suffix(String suffix) {
	          this.suffix = suffix;
	      }
	      public String fullName() {
	          return first_name + " " + middle_name + " " + last_name + " " + suffix;
	      }
	  }
} 

