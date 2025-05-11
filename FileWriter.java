import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class FileWriter {
	
	public static void writeToFile(LinkedList<Student> studentList, String fileName) {
		try (PrintWriter writer = new PrintWriter(new File(fileName))){
			// Loop through each student and write to the file
			for (Student student: studentList) {
				writer.println(
						"Name: " + student.name + "\n" + 
						"Address: " + student.address + "\n" + 
						"GPA: " + student.GPA + "\n");
			}
		} catch(IOException except) {
			System.out.println("Error writing to file: " + except.getMessage());
		}
	}
}
