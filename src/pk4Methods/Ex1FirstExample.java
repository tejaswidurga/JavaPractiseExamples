package pk4Methods;

public class Ex1FirstExample {
	public int add(int a, int b) {
		int c = a+b;	
		return c;
	}
	public static void main(String[] args) {

		int a = 2;
		int b = 2;
		Ex1FirstExample fe = new Ex1FirstExample();
		System.out.println(fe.add(a,b));
	}
}
