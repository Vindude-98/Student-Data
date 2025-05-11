import java.util.LinkedList;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> StudentList = new LinkedList<>();
		Scanner scnr = new Scanner(System.in);
		int numStudents;
		
		//Define how many Students should be created
		System.out.print("How many students do you want to enter: ");
		numStudents = scnr.nextInt();

		// Create Student(s) and add them to Linked List
		for (int i = 0; i < numStudents; i++) {
			StudentList.add(new Student());
		}
		
		OutputStudents.printStudents(StudentList);
		FileWriter.writeToFile(StudentList, "student_output.txt");
		
		scnr.close();
	}
	
}
