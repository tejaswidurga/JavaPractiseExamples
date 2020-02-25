package pk14Polymorphism;
public class Ex4Oldman extends Ex1Man{
		public void action() {
			System.out.println("Walk");
		}
		public static void main(String[] args) {
			Ex1Man m = new Ex4Oldman();
			m.action();
		}
}