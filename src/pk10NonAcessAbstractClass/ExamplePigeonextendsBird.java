package pk10NonAcessAbstractClass;
public class ExamplePigeonextendsBird {
	public static void main(String[] args) {
		String flystring = fly();
		ExamplePigeonextendsBird p = new ExamplePigeonextendsBird();
		p.color();
		System.out.println(flystring);
	}
	private static String fly() {
		return null;
	}
	public void color() {
		System.out.println("My color is grey");
	}
}
