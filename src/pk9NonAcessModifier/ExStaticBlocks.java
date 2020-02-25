package pk9NonAcessModifier;
public class ExStaticBlocks {
	static int num;
	static String text;
	static {
		System.out.println("Initiating variables in block 1");
		num = 20;
		text = "hai";
	}
	static {
		System.out.println("Initiating variables in block 2");
		num = 21;
		text = "hello";
	}
	public static void main(String[] args) {
		System.out.println("Value of num is "+num);
		System.out.println("Value of text is "+text);
}
}
