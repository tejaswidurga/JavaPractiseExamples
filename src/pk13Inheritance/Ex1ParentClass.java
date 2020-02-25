package pk13Inheritance;
public class Ex1ParentClass {
	String name = "Teja";
	String role = "Student";
	String college = "Swarnandhra";
	public static void displayDetails() {
		Ex1ParentClass pc = new Ex1ParentClass();
		System.out.println("Name is "+pc.name);
		System.out.println("Role is "+pc.role);
		System.out.println("College is "+pc.college);
	}

}
