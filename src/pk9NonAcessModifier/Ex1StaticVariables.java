package pk9NonAcessModifier;
public class Ex1StaticVariables {
	int count = 0;
	public void count() {
		count++;
	}
	public int returncount() {
		return count;
	}
	public static void main(String[] args) {
		System.out.println("programming");
		Ex1StaticVariables s1 = new Ex1StaticVariables();
		Ex1StaticVariables s2 = new Ex1StaticVariables();
		s1.count();
		int y = s1.returncount();
		int h = s2.returncount();
		System.out.println("Count value is "+y);
		System.out.println("Count value is "+h);


	
		// 

	}

}
