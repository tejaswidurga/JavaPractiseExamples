package pk16UsingThiskeyword;
public class Ex3AccessingMethodFromAnotherMethod {
int a = 10;
	public void method1() {
		System.out.println("I am in method 1");
		this.method2();
	}
	public void method2() {
		System.out.println("I am method 2");
	}
	public static void main(String[] args) {	
		Ex3AccessingMethodFromAnotherMethod te = new Ex3AccessingMethodFromAnotherMethod();
		te.method1();
	}
}
