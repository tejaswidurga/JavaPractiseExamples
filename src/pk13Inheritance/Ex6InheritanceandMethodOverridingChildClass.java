package pk13Inheritance;
public class Ex6InheritanceandMethodOverridingChildClass extends Ex5InheritanceandMethodOverridingParentClass {
		Ex6InheritanceandMethodOverridingChildClass(){
			System.out.println("Child Class Constructor");
		}
		public void displayDetails() {
			System.out.println("I belong to child class");
			super.displayDetails();
		}
		public static void main(String[] args) {
			Ex6InheritanceandMethodOverridingChildClass cl = new Ex6InheritanceandMethodOverridingChildClass();
			cl.displayDetails(); 
	}
}
