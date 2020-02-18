package pk1ClassObject;

public class Ex2ObjectExample {
	int a=1;
	int b=2;
	public void Disp() {
		Ex2ObjectExample obj = new Ex2ObjectExample();
		System.out.println("b value is "+ obj.b);
	}
	public static void main(String[] args) {
		Ex2ObjectExample ob = new Ex2ObjectExample();
		System.out.println("a value is "+ob.a);
		ob.Disp();
	}
}


