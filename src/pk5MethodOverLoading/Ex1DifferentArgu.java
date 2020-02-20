package pk5MethodOverLoading;
public class Ex1DifferentArgu {
	public static void details(int age, String name) {
		System.out.println("Age is "+age+" Name is "+name);
	}
	public static void details(int age, int sno, String name) {
		System.out.println("Age is "+age+" S.No is "+sno+" Name is "+name);
	}
	public static void main(String[] args) {
		details(40, "Ramu");
		details(67, 643, "Akhil");
	}
}
