package pk15usingSuperKeyword;
public class Ex2AccesingParentClassWithSuperKeyChild extends Ex1AccesingParentClassWithSuperKeyParent{
	int age = 15;
	String name = "Lakshmi";
	public void displayParentDetails() {
		System.out.println(super.age);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		Ex2AccesingParentClassWithSuperKeyChild cl = new Ex2AccesingParentClassWithSuperKeyChild();
		cl.displayParentDetails();
		System.out.println(cl.age);
		System.out.println(cl.name);
		{
		}
	}
}
