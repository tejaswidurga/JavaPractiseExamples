package pk14Polymorphism;
public class Ex2Child extends Ex1Man {
	public void action() {
		System.out.println("Crawl");
	}
	public static void main(String[] args) {
		Ex1Man m = new Ex2Child();
		m.action();
	}
}
