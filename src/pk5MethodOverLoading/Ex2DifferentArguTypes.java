package pk5MethodOverLoading;
public class Ex2DifferentArguTypes {
	public static void details(int a, int b) {
		System.out.println("a is "+a+" b is "+b);
	}
	public static void details(String a, String b) {
		System.out.println("a is "+a+" b is "+b);
	}
	public static void main(String[] args) {
		details(80, 60);
		details("Varun", "Sandesh");
	}
}
