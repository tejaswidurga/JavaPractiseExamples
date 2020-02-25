package pk13Inheritance;

public class Ex4ConstructorsandInheritanceChildClass extends Ex3ConstructorsandInheritanceParentClass  {
	Ex4ConstructorsandInheritanceChildClass(){
		System.out.println("Child Class Constructor");
	}
	public static void main(String[] args) {
		Ex4ConstructorsandInheritanceChildClass cl = new Ex4ConstructorsandInheritanceChildClass();
		System.out.println("Name is "+cl.name);
		System.out.println("Role is "+cl.role);
		System.out.println("College is "+cl.college);

	

}
}
