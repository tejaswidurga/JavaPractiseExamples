package pk6Constructors;

public class Ex1ConstructorExample {
	int age;
	String name;
	Ex1ConstructorExample(){
		this.age = 70;
		this.name = "Akhila";
	}
	Ex1ConstructorExample(int age, String name){
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		Ex1ConstructorExample cd1 = new Ex1ConstructorExample();
		System.out.println("Age is "+cd1.age);
		System.out.println("Name is "+cd1.name);
		Ex1ConstructorExample cd2 = new Ex1ConstructorExample(55, "Ramesh");
		System.out.println("Age is "+cd2.age);
		System.out.println("Name is "+cd2.name);
	}
}
