package pk3DataTypes;

public class Ex2DataExample {
	static short  a = 3;
	static int b=6;
	static int c=2;
	static short d;
	public static void main(String[] args) {
		b = a;
		System.out.println("b value is"+b);
		d = (short) c;
		System.out.println("c value is "+c);
}
}
