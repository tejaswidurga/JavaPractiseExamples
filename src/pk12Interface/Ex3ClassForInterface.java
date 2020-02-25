package pk12Interface;
public class Ex3ClassForInterface implements Ex2TestInterface1 {
	public void test1() {
		System.out.println("Creating test1");
	}
	public void test2() {
		System.out.println("Creating test2");
	}
	public void test3() {
		System.out.println("Creating test3");
	}
	public void test4() {
		System.out.println("Creating test4");
	}
	public static void main(String[] args) {
		Ex2TestInterface1 el = new Ex3ClassForInterface();
		el.test1();
		el.test2();
	    el.test3();
		el.test4();
	}

}





