package pk16UsingThiskeyword;
public class Ex1ThisKeyword {
	static int a;
	static int b;
	public void assign(int c, int d) {
		a = c;
		b = d; 
	}
	public static void main(String[] args) {
		Ex1ThisKeyword ek = new Ex1ThisKeyword();
		ek.assign(5,6);
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
	}
}
