package pk14Polymorphism;
public class Ex3Youngster extends Ex1Man{
		public void action() {
			System.out.println("Walk and Run");
		}
		public static void main(String[] args) {
			Ex1Man m = new Ex3Youngster();
			m.action();
}
}
