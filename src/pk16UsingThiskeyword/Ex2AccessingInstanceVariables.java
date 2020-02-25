package pk16UsingThiskeyword;

public class Ex2AccessingInstanceVariables {
int a = 10;
	public static void main(String[] args) {	
		Ex2AccessingInstanceVariables te = new Ex2AccessingInstanceVariables();
		te.method1();
	}
	public void method1() {
		int a = 30;
		System.out.println("a value is "+this.a);
	}
}

