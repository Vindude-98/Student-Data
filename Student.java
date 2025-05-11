import java.util.Scanner;

public class Student {
	
	// FIXME: Need to make variables public so OutoutStudents method can reference these.
	public String name; 
	public String address;
	public double GPA;
		
	Scanner scnr = new Scanner(System.in);
	

	Student(){
		boolean validGPA = false;
		
		while(!validGPA) {
			try {
				System.out.print("Enter Student Name: ");
				name = scnr.nextLine();
				
				System.out.print("Enter Student Address: ");
				address = scnr.nextLine();
				
				System.out.print("Enter Student GPA: ");
				GPA = scnr.nextDouble();
				
				if(GPA < 0.0 || GPA > 4.0) {
					throw new Exception();
				}
				
				// If GPA is valid, break the loop
				validGPA = true;
				
			} catch(Exception except) {
				System.out.println("Invalid GPA!! Please enter GPA between 0.0 and 4.0");
				scnr.nextLine(); // Consume the invalid input (flush the scanner buffer)
			}
		}

	}		
	
	@Override
	public String toString() {
		return name + address + GPA;
	}
}
