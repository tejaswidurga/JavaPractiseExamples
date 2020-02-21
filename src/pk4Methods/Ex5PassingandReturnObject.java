package pk4Methods;

public class Ex5PassingandReturnObject {
	public Ex5PassingandReturnObject setVariable(Ex5PassingandReturnObject abc) {
		Ex5PassingandReturnObject abc1 = new Ex5PassingandReturnObject();
		abc1.c = abc.c * 10;
		return abc1;
	}

	public static void main(String[] args) {
	
		int abc1 = new Ex5PassingandReturnObject();
		abc1 = 2;
	
		Ex5PassingandReturnObject abc2 = new Ex5PassingandReturnObject();
		abc2 = abc2.setVariable(abc1);
		System.out.println(abc2.a);
	}


}
