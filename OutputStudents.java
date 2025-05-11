import java.util.LinkedList;

public class OutputStudents extends Student{

	public static void printStudents(LinkedList<Student> students) {
		
		System.out.println("\n\nStudent's in ascending order by name:\n");
		
		students.sort(new NameComparator());
		
		for (Student student: students) {
			System.out.println(
					"Name: " + student.name + "\n" + 
					"Address: " + student.address + "\n" + 
					"GPA: " + student.GPA + "\n");
		}
	}
}
