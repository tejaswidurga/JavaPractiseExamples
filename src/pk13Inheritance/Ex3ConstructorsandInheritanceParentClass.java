package pk13Inheritance;
public class Ex3ConstructorsandInheritanceParentClass {
	String name = "Teja";
	String role = "Student";
	String college = "Swarnandhra";
	 Ex3ConstructorsandInheritanceParentClass(){
		System.out.println("Parent Class Constructor");
	}
	public static void displayDetails() {
		 Ex3ConstructorsandInheritanceParentClass pc = new  Ex3ConstructorsandInheritanceParentClass();
		System.out.println("Name is "+pc.name);
		System.out.println("Role is "+pc.role);
		System.out.println("College is "+pc.college);
}
}
